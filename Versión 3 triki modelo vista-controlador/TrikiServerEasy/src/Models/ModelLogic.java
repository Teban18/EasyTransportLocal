/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author alejo
 */
import java.io.*;
import java.net.*;
import java.util.Random;

public class ModelLogic {

    private char mBoard[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private final int BOARD_SIZE = mBoard.length;

    public static final char HUMAN_PLAYER = 'X';
    public static final char COMPUTER_PLAYER = 'O';

    private Random mRand;
    private String outMessage;
    private int pcPosition;
    private int userMove;
    private int win;
    private boolean validMove;
    private int numberError;
    private boolean statusChange;
    private String message;

    static final int PORT = 7000;

    public ModelLogic() {
        try {
            ServerSocket skServer = new ServerSocket(PORT);

            // Seed the random number generator
            mRand = new Random();
            statusChange = false;
            win = 10;

            // Keep looping until someone wins or a tie
            while (win == 10) {

                Socket skHost = skServer.accept();

                validMove = true;

                DataInputStream streamInput = new DataInputStream(skHost.getInputStream());
                String inputMessage = streamInput.readUTF();
                userMove = Integer.parseInt(inputMessage);
                setUserMove(userMove);

                OutputStream streamOutput = skHost.getOutputStream();
                DataOutputStream outputMessage = new DataOutputStream(streamOutput);
                getComputerMove();
                checkForState();
                outputMessage.writeUTF(outMessage);

                win = checkForWinner();

                skHost.close();
            }
            skServer.close();
        } catch (IOException | NumberFormatException e) {
            message = e.toString();
            statusChange = true;
            sendMessage();
        }
    }

    // Check for a winner.  Return
    //  10 if no winner or tie yet
    //  11 if it's a tie
    //  12 if X won
    //  13 if O won
    private void checkForState() {

        //Retorna 14 si el movimiento del pc no es válido
        if (!validMove && numberError == 0) {
            validMove = true;
            outMessage = "14,14";
            return;
        }

        if (!validMove && numberError == 1) {
            validMove = true;
            outMessage = "15,15";
            return;
        }

        // Check horizontal wins
        for (int i = 0; i <= 6; i += 3) {
            if (mBoard[i] == HUMAN_PLAYER
                    && mBoard[i + 1] == HUMAN_PLAYER
                    && mBoard[i + 2] == HUMAN_PLAYER) {
                outMessage = Integer.toString(pcPosition) + ",12";
                return;
            }
            if (mBoard[i] == COMPUTER_PLAYER
                    && mBoard[i + 1] == COMPUTER_PLAYER
                    && mBoard[i + 2] == COMPUTER_PLAYER) {
                outMessage = Integer.toString(pcPosition) + ",13";
                return;
            }
        }

        // Check vertical wins
        for (int i = 0; i <= 2; i++) {
            if (mBoard[i] == HUMAN_PLAYER
                    && mBoard[i + 3] == HUMAN_PLAYER
                    && mBoard[i + 6] == HUMAN_PLAYER) {
                outMessage = Integer.toString(pcPosition) + ",12";
                return;
            }
            if (mBoard[i] == COMPUTER_PLAYER
                    && mBoard[i + 3] == COMPUTER_PLAYER
                    && mBoard[i + 6] == COMPUTER_PLAYER) {
                outMessage = Integer.toString(pcPosition) + ",13";
                return;
            }
        }

        // Check for diagonal wins
        if ((mBoard[0] == HUMAN_PLAYER
                && mBoard[4] == HUMAN_PLAYER
                && mBoard[8] == HUMAN_PLAYER)
                || (mBoard[2] == HUMAN_PLAYER
                && mBoard[4] == HUMAN_PLAYER
                && mBoard[6] == HUMAN_PLAYER)) {
            outMessage = Integer.toString(pcPosition) + ",12";
            return;
        }
        if ((mBoard[0] == COMPUTER_PLAYER
                && mBoard[4] == COMPUTER_PLAYER
                && mBoard[8] == COMPUTER_PLAYER)
                || (mBoard[2] == COMPUTER_PLAYER
                && mBoard[4] == COMPUTER_PLAYER
                && mBoard[6] == COMPUTER_PLAYER)) {
            outMessage = Integer.toString(pcPosition) + ",13";
            return;
        }

        // Check for tie
        for (int i = 0; i < BOARD_SIZE; i++) {
            // If we find a number, then no one has won yet
            if (mBoard[i] != HUMAN_PLAYER && mBoard[i] != COMPUTER_PLAYER) {
                outMessage = Integer.toString(pcPosition) + ",10";
                return;
            }
        }
        // If we make it through the previous loop, all places are taken, so it's a tie
        outMessage = Integer.toString(pcPosition) + ",11";
    }

    public int checkForWinner() {

        // Check horizontal wins
        for (int i = 0; i <= 6; i += 3) {
            if (mBoard[i] == HUMAN_PLAYER
                    && mBoard[i + 1] == HUMAN_PLAYER
                    && mBoard[i + 2] == HUMAN_PLAYER) {
                return 12;
            }
            if (mBoard[i] == COMPUTER_PLAYER
                    && mBoard[i + 1] == COMPUTER_PLAYER
                    && mBoard[i + 2] == COMPUTER_PLAYER) {
                return 13;
            }
        }

        // Check vertical wins
        for (int i = 0; i <= 2; i++) {
            if (mBoard[i] == HUMAN_PLAYER
                    && mBoard[i + 3] == HUMAN_PLAYER
                    && mBoard[i + 6] == HUMAN_PLAYER) {
                return 12;
            }
            if (mBoard[i] == COMPUTER_PLAYER
                    && mBoard[i + 3] == COMPUTER_PLAYER
                    && mBoard[i + 6] == COMPUTER_PLAYER) {
                return 13;
            }
        }

        // Check for diagonal wins
        if ((mBoard[0] == HUMAN_PLAYER
                && mBoard[4] == HUMAN_PLAYER
                && mBoard[8] == HUMAN_PLAYER)
                || (mBoard[2] == HUMAN_PLAYER
                && mBoard[4] == HUMAN_PLAYER
                && mBoard[6] == HUMAN_PLAYER)) {
            return 12;
        }
        if ((mBoard[0] == COMPUTER_PLAYER
                && mBoard[4] == COMPUTER_PLAYER
                && mBoard[8] == COMPUTER_PLAYER)
                || (mBoard[2] == COMPUTER_PLAYER
                && mBoard[4] == COMPUTER_PLAYER
                && mBoard[6] == COMPUTER_PLAYER)) {
            return 13;
        }

        // Check for tie
        for (int i = 0; i < BOARD_SIZE; i++) {
            // If we find a number, then no one has won yet
            if (mBoard[i] != HUMAN_PLAYER && mBoard[i] != COMPUTER_PLAYER) {
                return 10;
            }
        }
        // If we make it through the previous loop, all places are taken, so it's a tie
        return 11;
    }

    private void setUserMove(int move) {
        if (move < 0 || move > BOARD_SIZE) {
            validMove = false;
            numberError = 0;
        } else if (mBoard[move] == HUMAN_PLAYER || mBoard[move] == COMPUTER_PLAYER) {
            validMove = false;
            numberError = 1;
        } else {
            validMove = true;
            mBoard[move] = HUMAN_PLAYER;
        }
    }

    private void getComputerMove() {
        if (validMove) {
            int move;

            // Generate random move
            do {
                move = mRand.nextInt(BOARD_SIZE);
                switch (checkForWinner()) {
                    case 11:
                        pcPosition = 11;
                        win = 11;
                        return;
                    case 12:
                        pcPosition = 12;
                        win = 12;
                        return;
                    case 13:
                        pcPosition = 13;
                        win = 13;
                        return;
                }
            } while (mBoard[move] == HUMAN_PLAYER || mBoard[move] == COMPUTER_PLAYER);

            mBoard[move] = COMPUTER_PLAYER;
            pcPosition = move;
        }
    }

    public void cleanBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            mBoard[i] = (char) i;
        }
    }
    
    public String sendMessage() {
        if (statusChange) {
            return message;
        }
        return null;
    }

    public static int getPORT() {
        return PORT;
    }
}
