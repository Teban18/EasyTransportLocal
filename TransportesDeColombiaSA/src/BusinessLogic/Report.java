/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Deiber
 */
public class Report {

    String qs;
    String thiscolumns;
    String thispath;
    FileWriter fr;
    BufferedWriter br;
    Object[] row;
    ArrayList <String> listobject;

    public String getSqlsentence(String table, ArrayList<String> columns) {
        qs = "";
        thiscolumns = "";
        for (int i = 0; i < columns.size(); i++) {
            thiscolumns += columns.get(i) + ",";
        }
        thiscolumns = thiscolumns.substring(0, thiscolumns.length() - 1);
        qs = "SELECT " + thiscolumns + " FROM " + table;
        return qs;
    }

    public void CreateFile(String path) {
        thispath = path;
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void fromRsToArray(ResultSet rs, ArrayList<String> columns) {
        try {
            String currentvalue;
            listobject = new ArrayList();
            while (rs.next()) {
                currentvalue="";
                row = new Object[columns.size()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = rs.getObject(i + 1);
                    currentvalue += String.valueOf(row[i]+",");   
                }
                currentvalue = currentvalue.substring(0, currentvalue.length() - 1)+";"; 
                listobject.add(currentvalue);
                listobject.add("\n");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeFile() {
        try {
            fr = new FileWriter(thispath);
            br = new BufferedWriter(fr);
            for (int i = 0; i < listobject.size(); i++) {
                br.write((String)listobject.get(i));
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
