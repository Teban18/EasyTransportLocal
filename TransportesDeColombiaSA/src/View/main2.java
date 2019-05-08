/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BusinessLogic.User;
import Control.Dispath;

/**
 *
 * @author Teban18
 */
public class main2 {
    
    public static void main(String[] args) {
        
        User u=new User(1, "", "", "", "", "", "", "", "", "", "");
        Dispath d=new Dispath();
        d.registry(u);
    }
}
