/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import BusinessLogic.City;
import View.CityView;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Teban18
 */
public class CrudCityController {

    private City city = new City();
    private ConnectionController connectioncontroller;
    ArrayList<City> citylist = new ArrayList<City>();

    public void setConnectioncontroller(ConnectionController connectioncontroller) {
        this.connectioncontroller = connectioncontroller;
    }

    public void insertCity(String city_name, String state, String department) {
        System.out.println("6");
        this.city.setName(city_name);
        this.city.setState(state);
        this.city.setDeparment(department);
        System.out.println("7");
        try {
            System.out.println("8");
            String sql = "INSERT IGNORE INTO city (city_name,state,department)"
                    + "VALUES (?,?,?)";
            PreparedStatement statement = connectioncontroller.getConnection().prepareStatement(sql);
            statement.setString(1, this.city.getName());
            statement.setString(2, this.city.getState());
            statement.setString(3, this.city.getDeparment());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Nueva Ciudad Agregada");
                System.out.println("9");
            }
        } catch (SQLException e) {
            System.out.println("No se insertó ciudad" + e.getMessage());
        }
    }

    public void readCity() {
        String sql = "SELECT * FROM city";
        try {
            Statement statement =  connectioncontroller.getConnection().createStatement();
            ResultSet result = statement.executeQuery(sql);
            city = null;
            while (result.next()) {
                city = new City();
                city.setName(result.getString("city_name"));
                city.setState(result.getString("state"));
                city.setDeparment(result.getString("department"));
                Timestamp createddate = result.getTimestamp("create_city_date");
                city.setCreated_date(String.valueOf(createddate));
                citylist.add(city);
            }       
        } catch (SQLException e) {
        }
    }

    public void updateCity(String city_name, String state, String department) {
        this.city.setName(city_name);
        this.city.setState(state);
        this.city.setDeparment(department);
        try{
        String sql = "UPDATE city SET city_name=?, state=?, department=? ";
        PreparedStatement statement = connectioncontroller.getConnection().prepareStatement(sql);
        statement.setString(1, city.getName());
        statement.setString(2, city.getState());
        statement.setString(3, city.getDeparment());
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Ciudad Actualizada");
        }
        }catch(SQLException e){
            System.out.println("Error sql : "+e.getMessage());
        }
    }

    public ArrayList<City> getCityList() {
        return citylist;
    }

    public void clearCityArrayList() {
        citylist.clear();
    }
}
