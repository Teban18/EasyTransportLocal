/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;


import java.util.ArrayList;


/**
 *
 * @author Deiber
 */
public class Create {
 String thisvalues;
 String thiscolumns;
 String qs;
 
 
    public String getSqlSentence(String table, ArrayList<String>columns, ArrayList<String> values) {
        qs = "";
        thiscolumns = "(";
        for (int i=0;i<columns.size();i++){
            thiscolumns += columns.get(i) + ",";
        }
        thiscolumns = thiscolumns.substring(0, thiscolumns.length() - 1)+")";
        thisvalues = "(";
        for (int i=0;i<values.size();i++){
            thisvalues += "'"+values.get(i)+"'" + ",";
        }
        thisvalues = thisvalues.substring(0, thisvalues.length() - 1)+")"+";"; 
        qs+="INSERT INTO "+table+"\n "+ thiscolumns + "VALUES" + thisvalues;
    return  qs;  
    }
    
}
