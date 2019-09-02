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
public class Update {
    
 String thiscondition;
 String thisqs;
 String qs;
 
 
    public String getSqlSentence(String table, ArrayList<String>columns, ArrayList<String> values,
            String idfield ,int value) {
        qs = "";
        thisqs = "";
      
        if(columns.size()==values.size()){
        for (int i=0;i<columns.size();i++){
            thisqs += columns.get(i) + "='" +values.get(i)+"'"+",";
        }
        thisqs = thisqs.substring(0, thisqs.length() - 1)+"";
        thiscondition= idfield+"="+value+";";
        
        qs+="UPDATE "+table+" SET "+thisqs+" WHERE "+thiscondition;

       
    return  qs;  
      
        }else{
          
        }
     return null;
    
    }
    
}
