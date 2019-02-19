/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ModelLogic;
import Views.ViewFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alejo
 */
public class ControllerServer implements ActionListener{
    private final ViewFrame frame;
    private ModelLogic modelLogic;

    public ControllerServer(ViewFrame frame) {
        this.frame = frame;
        
        this.frame.getBtnPlay().addActionListener(this);
        starView();
    }
    
    public void starView() {
        frame.setVisible(true);
        frame.setTitle("Triki server");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getLblPort().setText("8000");
    }
    
    public void showMessage(String message) {
        if (modelLogic.sendMessage() != null) {
            frame.getOptionPane().showMessageDialog(frame, message);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelLogic = new ModelLogic();
        showMessage(modelLogic.sendMessage());
        modelLogic.cleanBoard();
    }
}
