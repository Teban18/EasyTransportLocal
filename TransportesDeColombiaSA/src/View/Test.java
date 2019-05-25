/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ConnectionController;
import Control.Crud;

import Control.DBImplementationcontroller;
import Control.LoginController;
import java.sql.Connection;

/**
 *
 * @author Teban18
 */
public class Test {

    public static void main(String[] args) {
        ConnectionController connection = new ConnectionController();
        DBImplementationcontroller DBimplementation = new DBImplementationcontroller();
        LoginController logincontroller = new LoginController();
        Crud crud = new Crud();

        //Control de conexion con la base de datos en todos los procesos de controladores
        connection.connect("");
        DBimplementation.setConnection(connection);
        DBimplementation.createDB();
        logincontroller.setConnection(connection);
        crud.setConnection(connection);

        //Creacion objetos de vistas
        LoginView loginview = new LoginView();
        MenuView menuview = new MenuView();
        CityView cityview = new CityView();
        UserView userview = new UserView();
        ClientView clientview= new ClientView();
        ShipmentView shipmentview=new ShipmentView();
        RolView rolview=new RolView();

        //Relacion vistas-controladores
        loginview.setLogincontroller(logincontroller);
        cityview.setCrud(crud);
        userview.setCrud(crud);
        clientview.setCrud(crud);
        shipmentview.setCrud(crud);
        rolview.setCrud(crud);

        //Relacion entre las vistas
        loginview.setMenuView(menuview);
        menuview.setCityview(cityview);
        menuview.setUserview(userview);
        menuview.setClientview(clientview);
        menuview.setShipmentview(shipmentview);
        menuview.setRolview(rolview);
        
        //Inicializacion de la aplicacion
        loginview.setVisible(true);
        loginview.setLocationRelativeTo(null);

    }

}
