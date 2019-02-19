/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ModelLogic;
import Views.ViewConsoleGame;
import Views.ViewInitialFrame;

/**
 *
 * @author Alejandro
 */
public class ControllerMain {

    private static ControllerInitialFrame controllerGame;
    private static ViewInitialFrame initialFrame;
    
    private static ControllerConsoleGame consoleGame;
    private static ViewConsoleGame viewConsole;
    private static ModelLogic modelLogic;

    
    public static void main(String args[]) {
        viewConsole = new ViewConsoleGame();
        modelLogic = new ModelLogic();
        consoleGame = new ControllerConsoleGame(viewConsole, modelLogic);

//        initialFrame = new ViewInitialFrame();
//        controllerGame = new ControllerInitialFrame(initialFrame);
    }
}
