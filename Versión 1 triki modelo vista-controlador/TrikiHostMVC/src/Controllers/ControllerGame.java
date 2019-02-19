/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Models.ModelLogic;
import Views.ViewFrameGame;
import Views.ViewInitialFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alejandro
 */
public final class ControllerGame implements ActionListener {

    private final ViewInitialFrame initialFrame;
    private ViewFrameGame frameGame;
    private ControllerLogic controllerLogic;
    private static ModelLogic modelLogic;

    private int port;
    private String ip;

    public ControllerGame(ViewInitialFrame initialFrame) {
        this.initialFrame = initialFrame;
        
        this.initialFrame.getBtnPlay().addActionListener(this);
        starView();
    }

    public void starView() {
        initialFrame.setVisible(true);
        initialFrame.setLocationRelativeTo(null);
        initialFrame.setTitle("Triki");
        initialFrame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (initialFrame.getTxtIP().getText().isEmpty()) {
            showMessage("Por favor, ingrese la información solicitada");
        } else {
            ip = initialFrame.getTxtIP().getText();
            port = selectPort();
            frameGame = new ViewFrameGame();
            modelLogic = new ModelLogic();
            controllerLogic = new ControllerLogic(frameGame, modelLogic, ip, port);
            initialFrame.dispose();
        }
    }

    public int selectPort() {
        String levelSelected = initialFrame.getCbLevel().getSelectedItem().toString();
        port = 0;
        switch (levelSelected) {
            case "Facil":
                return 7000;
            case "Intermedio":
                return 8000;
            case "Dificil":
                return 9000;
        }
        return 0;
    }
    
    public void showMessage(String message) {
        initialFrame.getOptionPane().showMessageDialog(initialFrame, message);
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
