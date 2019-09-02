/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.MenuView;

/**
 *
 * @author Teban18
 */
public class PermissionsController {
    
    private MenuView menuview;
    
    public void setMenu(MenuView menuview){
    this.menuview=menuview;    
    }
            
    
    public void validatePermissions(String rol ){
        
        if (rol.equals("administrator")){
            
        }else if (rol.equals("employee")){
            
        }else if (rol.equals("cashier")){
            
        }else if (rol.equals("driver")){
            
        }else if (rol.equals("grocer")){
            
        }else if (rol.equals("carrier")){
            
        }
        
    }
}
