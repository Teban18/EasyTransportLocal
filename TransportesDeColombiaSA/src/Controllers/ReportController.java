/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import BusinessLogic.Query;
import BusinessLogic.Report;
import java.util.ArrayList;


/**
 *
 * @author Teban18
 */
public class ReportController {
    private Report report=new Report();
    private Query query= new Query();
    private ConnectionController connection;


    public void setConnection(ConnectionController connection) {
        this.connection = connection;
    }

   

    public void sendReport(String table,ArrayList<String>columns,String path){    
           query.readquery(connection,report.getSqlsentence(table, columns));
           report.CreateFile(path);
           report.fromRsToArray(query.getresultset(), columns);
           report.writeFile();      
    }
 
   
}
