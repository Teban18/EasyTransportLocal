/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ViewConsoleGame {

    private final Scanner scannerMove = new Scanner(System.in);

    public void startGame() {
        System.out.println("Bienvenido a triki");
    }

    public int getPort() {
        System.out.println("Ingrese el puerto: ");
        return scannerMove.nextInt();
    }

    public String getIP() {
        System.out.println("Ingrese la ip: ");
        return scannerMove.next();
    }

    public int getMove() {
        System.out.print("Ingrese su movimiento: ");
        return scannerMove.nextInt();
    }

    public void displayBoard(String mBoard[]) {
        System.out.println();
        System.out.println(mBoard[0] + " | " + mBoard[1] + " | " + mBoard[2]);
        System.out.println("-----------");
        System.out.println(mBoard[3] + " | " + mBoard[4] + " | " + mBoard[5]);
        System.out.println("-----------");
        System.out.println(mBoard[6] + " | " + mBoard[7] + " | " + mBoard[8]);
        System.out.println();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
