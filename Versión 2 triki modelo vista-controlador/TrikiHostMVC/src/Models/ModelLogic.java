/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Alejandro
 */
public class ModelLogic {

    private final String mBoard[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};

    private final String HUMAN_PLAYER = "X";
    private final String COMPUTER_PLAYER = "O";

    private int port;
    private String ip;

    private boolean sendMove;
    private boolean statusChange;

    private int win;
    private int computerMove;
    private String inMessage;
    private String outMessage;
    private String message;
    private String arrayWord[];

    private boolean validMove;

    public int userMove;

    public ModelLogic() {
        win = 10;
        sendMove = false;
        port = 0;
        ip = "";
    }

    public void connectSocket() {

        if (win == 10 && sendMove) {
            try (Socket skClient = new Socket(ip, port)) {
                validMove = true;
                OutputStream outputMessage = skClient.getOutputStream();
                DataOutputStream flujoSalida = new DataOutputStream(outputMessage);
                outMessage = Integer.toString(userMove);
                flujoSalida.writeUTF(outMessage);

                DataInputStream inputMessage = new DataInputStream(skClient.getInputStream());
                inMessage = inputMessage.readUTF();
                setComputerMove(inMessage);

                sendMove = false;

                skClient.close();
            } catch (Exception e) {
                message = e.toString();
                statusChange = true;
                sendMessage();
            }
        }
        // Report the winner
        switch (win) {
            case 11:
                message = "Es un empate!";
                statusChange = true;
                sendMessage();
                break;
            case 12:
                message = HUMAN_PLAYER + " ganó!";
                statusChange = true;
                sendMessage();
                break;
            case 13:
                message = COMPUTER_PLAYER + " ganó!";
                statusChange = true;
                sendMessage();
                break;
            case 14:
                message = "Ingrese una posición entre 0 y 8";
                validMove = false;
                win = 10;
                sendMessage();
                break;
            case 15:
                message = "La posición ya está ocupada";
                validMove = false;
                win = 10;
                sendMessage();
                break;
        }
    }

    public void setUserMove(int message) {
        userMove = message;
        connectSocket();
        if (validMove) {
            mBoard[message] = HUMAN_PLAYER;
        }
    }

    public void setComputerMove(String move) {
        arrayWord = move.split(",");
        if (arrayWord[0].equals(arrayWord[1])) {
            win = Integer.parseInt(arrayWord[1]);
        } else {
            computerMove = Integer.parseInt(arrayWord[0]);
            win = Integer.parseInt(arrayWord[1]);
            mBoard[computerMove] = COMPUTER_PLAYER;
        }
    }

    public void cleanBoard() {
        for (int i = 0; i < mBoard.length; i++) {
            mBoard[i] = Integer.toString(i);
        }
    }

    public int getComputerMove() {
        return computerMove;
    }

    public String sendMessage() {
        if (statusChange || !validMove) {
            return message;
        }
        return null;
    }
    
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isSendMove() {
        return sendMove;
    }

    public void setSendMove(boolean sendMove) {
        this.sendMove = sendMove;
    }

    public boolean isStatusChange() {
        return statusChange;
    }

    public void setStatusChange(boolean thereWinner) {
        this.statusChange = thereWinner;
    }

    public String[] getmBoard() {
        return mBoard;
    }

    public String getHUMAN_PLAYER() {
        return HUMAN_PLAYER;
    }

    public String getCOMPUTER_PLAYER() {
        return COMPUTER_PLAYER;
    }

    public int getWin() {
        return win;
    }
}
