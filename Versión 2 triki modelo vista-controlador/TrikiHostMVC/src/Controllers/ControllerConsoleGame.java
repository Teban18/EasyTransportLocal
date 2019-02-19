/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ModelLogic;
import Views.ViewConsoleGame;

/**
 *
 * @author Alejandro
 */
public final class ControllerConsoleGame {

    private final ViewConsoleGame consoleGame;
    private final ModelLogic modelLogic;

    private int userMove;

    private final int port;
    private final String ip;

    public ControllerConsoleGame(ViewConsoleGame consoleGame, ModelLogic modelLogic) {
        this.consoleGame = consoleGame;
        this.modelLogic = modelLogic;

        this.consoleGame.startGame();
        this.consoleGame.displayBoard(modelLogic.getmBoard());
        port = consoleGame.getPort();
        ip = consoleGame.getIP();

        modelLogic.setPort(port);
        modelLogic.setIp(ip);

        while (modelLogic.getWin() == 10) {
            startGame();
        }
    }

    public void startGame() {
        userMove = consoleGame.getMove();
        modelLogic.setSendMove(true);
        modelLogic.setUserMove(userMove);
        getComputerMove();
    }

    public void getComputerMove() {
        modelLogic.getComputerMove();
        consoleGame.displayBoard(modelLogic.getmBoard());
        showMessage(modelLogic.sendMessage());

    }

    public void showMessage(String message) {
        if (modelLogic.sendMessage() != null) {
            consoleGame.showMessage(message);
        }
    }
}
