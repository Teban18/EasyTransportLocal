/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.ArrayList;

/**
 *
 * @author Teban18
 */
public class Read {
    
 String qs;
 
 
    public String getSqlSentence(String table) {
        qs = "";
        qs+="SELECT * FROM "+ table+";";
     return qs;
    }
    
    public String getSqlSentenceSearchId(String table, String idname,int value){
        qs = "";
        qs+="SELECT * FROM "+ table+" WHERE "+idname+"="+value+";";
     return qs; 
    }
}
