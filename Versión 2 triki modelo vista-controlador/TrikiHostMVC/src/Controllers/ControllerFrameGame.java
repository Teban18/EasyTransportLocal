/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ModelLogic;
import Views.ViewFrameGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Alejandro
 */
public final class ControllerFrameGame implements ActionListener {

    private static ViewFrameGame frameGame;
    private static ModelLogic modelLogic;
    private static ControllerMain main;

    private int userMove;
    private int computerMove;

    private int port;
    private String ip;

    public ControllerFrameGame(ViewFrameGame frameGame, ModelLogic modelLogic) {
        this.frameGame = frameGame;
        this.modelLogic = modelLogic;

        
        this.frameGame.getBtn0().addActionListener(this);
        this.frameGame.getBtn1().addActionListener(this);
        this.frameGame.getBtn2().addActionListener(this);
        this.frameGame.getBtn3().addActionListener(this);
        this.frameGame.getBtn4().addActionListener(this);
        this.frameGame.getBtn5().addActionListener(this);
        this.frameGame.getBtn6().addActionListener(this);
        this.frameGame.getBtn7().addActionListener(this);
        this.frameGame.getBtn8().addActionListener(this);

        addButtonsToArray();
        
        this.modelLogic.setSendMove(false);
        this.modelLogic.setStatusChange(false);
        starView();
    }

    public void starView() {
        frameGame.setVisible(true);
        frameGame.setLocationRelativeTo(null);
        frameGame.setTitle("Triki");
        frameGame.setResizable(false);
        
        modelLogic.cleanBoard();
    }

    public void addButtonsToArray() {
        frameGame.getArrayButtons()[0] = frameGame.getBtn0();
        frameGame.getArrayButtons()[1] = frameGame.getBtn1();
        frameGame.getArrayButtons()[2] = frameGame.getBtn2();
        frameGame.getArrayButtons()[3] = frameGame.getBtn3();
        frameGame.getArrayButtons()[4] = frameGame.getBtn4();
        frameGame.getArrayButtons()[5] = frameGame.getBtn5();
        frameGame.getArrayButtons()[6] = frameGame.getBtn6();
        frameGame.getArrayButtons()[7] = frameGame.getBtn7();
        frameGame.getArrayButtons()[8] = frameGame.getBtn8();
    }

    public int getPositionJButton(JButton button) {
        int position = 0;
        for (int i = 0; i < frameGame.getArrayButtons().length; i++) {
            if (frameGame.getArrayButtons()[i].equals(button)) {
                position = i;
            }
        }
        return position;
    }

    public void showMessage(String message) {
        if (modelLogic.sendMessage() != null) {
            frameGame.getOptionPane().showMessageDialog(frameGame, message);
            frameGame.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelLogic.setSendMove(true);
        frameGame.setPressedButton((JButton) e.getSource());
        userMove = getPositionJButton(frameGame.getPressedButton());
        modelLogic.setUserMove(userMove);
        frameGame.getArrayButtons()[userMove].setText(modelLogic.getHUMAN_PLAYER());
        frameGame.getArrayButtons()[userMove].setEnabled(false);
        getComputerMove();
    }

    public void getComputerMove() {
        computerMove = modelLogic.getComputerMove();
        frameGame.getArrayButtons()[computerMove].setText(modelLogic.getCOMPUTER_PLAYER());
        frameGame.getArrayButtons()[computerMove].setEnabled(false);
        showMessage(modelLogic.sendMessage());
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

}
