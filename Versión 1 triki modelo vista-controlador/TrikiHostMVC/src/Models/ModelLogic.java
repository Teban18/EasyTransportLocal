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

    private final char mBoard[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    private static final char HUMAN_PLAYER = 'X';
    private static final char COMPUTER_PLAYER = 'O';

    private int port;
    private String ip;

    private boolean sendMove;
    private boolean thereWinner;

    private int win;
    private int computerMove;
    private String inMessage;
    private String outMessage;
    private String message;
    private String arrayWord[];

    public int userMove;

    public ModelLogic() {
        sendMove = false;
        port = 0;
        ip = "";
    }

    public void connectSocket() {
        win = 10;
        if (win == 10 && sendMove) {
            try (Socket skClient = new Socket(ip, port)) {
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
                thereWinner = true;
                sendMessage();
            }
        } else {
            return;
        }

        // Report the winner
        switch (win) {
            case 11:
                message = "Es un empate!";
                thereWinner = true;
                sendMessage();
                break;
            case 12:
                message = HUMAN_PLAYER + " ganó!";
                thereWinner = true;
                sendMessage();
                break;
            case 13:
                message = COMPUTER_PLAYER + " ganó!";
                thereWinner = true;
                sendMessage();
                break;
        }
    }

    public void setUserMove(int message) {
        mBoard[message] = HUMAN_PLAYER;
        userMove = message;
        connectSocket();
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

    public int getComputerMove() {
        return computerMove;
    }

    public String sendMessage() {
        if (thereWinner) {
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

    public boolean isThereWinner() {
        return thereWinner;
    }

    public void setThereWinner(boolean thereWinner) {
        this.thereWinner = thereWinner;
    }

}
