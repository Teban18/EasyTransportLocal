/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author Deiber
 */
public class Delete {
    
     String qs;
 
 
    public String getSqlSentence(String table, String idfield , int value) {
        qs = "";
        qs+="DELETE FROM "+ table+" WHERE "+idfield+"="+value+";";
     return qs;
    }
    
    
}
