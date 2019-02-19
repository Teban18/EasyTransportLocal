/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.ViewInitialFrame;

/**
 *
 * @author Alejandro
 */
public class ControllerMain {

    private static ControllerGame controllerGame;
    private static ViewInitialFrame initialFrame;

    public static void main(String args[]) {
        initialFrame = new ViewInitialFrame();
        controllerGame = new ControllerGame(initialFrame);
    }
}
