/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta1;

import javax.swing.JFrame;

/**
 *
 * @author Alna
 */
public class TA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login rg = new login();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
