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
        startGameConsole();
    }
    
    public static void startGameInterfaz(){
        initialFrame = new ViewInitialFrame();
        controllerGame = new ControllerInitialFrame(initialFrame);
    }
    
    public static void startGameConsole(){
        viewConsole = new ViewConsoleGame();
        modelLogic = new ModelLogic();
        consoleGame = new ControllerConsoleGame(viewConsole, modelLogic);
    }
    
    public static void setInitialFrame(ViewInitialFrame initialFrame) {
        ControllerMain.initialFrame = initialFrame;
    }

    public static void setViewConsole(ViewConsoleGame viewConsole) {
        ControllerMain.viewConsole = viewConsole;
    }

    public static void setModelLogic(ModelLogic modelLogic) {
        ControllerMain.modelLogic = modelLogic;
    }
}
