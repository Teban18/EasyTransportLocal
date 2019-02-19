/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.ViewFrame;

/**
 *
 * @author alejo
 */
public class ControllerMain {
    
    private static ViewFrame frame;
    private static ControllerServer controllerServer;
    
    public static void main (String args []){
        frame = new ViewFrame();
        controllerServer = new ControllerServer(frame);
    }
}
