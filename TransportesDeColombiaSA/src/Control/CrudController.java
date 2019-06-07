/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import BusinessLogic.Create;
import BusinessLogic.Delete;
import BusinessLogic.Query;
import BusinessLogic.Read;
import BusinessLogic.Report;
import BusinessLogic.Update;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Teban18
 */
public class CrudController {
   
    private ConnectionController connection;
    private Query query= new Query();
    private Create create= new Create();
    private Read read= new Read();
    private Delete delete= new Delete();
    private Update update= new Update();
    public void setConnection(ConnectionController connection) {
        this.connection = connection;
    }
    
    public void createstatement(String table,ArrayList<String> columns,ArrayList<String>values){
       query.sendQueryToMysql(connection,create.getSqlSentence(table, columns, values));
       query.closeStatement();
    }
    
      
    public void readstatement(String table){
       query.readquery(connection,read.getSqlSentence(table));
    }
    
    public void updatestatement(String table,ArrayList<String> columns,ArrayList<String>values
    ,String idfield,int value){
       query.sendQueryToMysql(connection,update.getSqlSentence(table, columns, values,idfield,value));
    }
    
    
    public void deletestatement(String table,String id_name,int value){
       query.sendQueryToMysql(connection,delete.getSqlSentence(table, id_name, value));
    }
    
    public void searchStatement (String table,String id_name, int value){
        query.readquery(connection, read.getSqlSentenceSearchId(table, id_name, value));
    }

    
    public ResultSet getresultset(){
        return query.getresultset();
    }
}
