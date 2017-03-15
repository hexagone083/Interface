/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author florian
 */
public class Tools {

    public static void windowsInit(JFrame jf) {

        jf.setVisible(true);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setResizable(false);
        jf.setLocationRelativeTo(null);

    }

    /**
     * et Jbuuton Enabled to true. for JButton activation
     *
     * @param jb
     */
    public static void activerBoutton(JButton... jb) {
        for (JButton b : jb) {
            b.setEnabled(true);
        }
    }

    /**
     * Set Jbuuton Enabled to false. for JButton desactivation
     *
     * @param jb
     */
    public static void desactiverBoutton(JButton... jb) {
        for (JButton b : jb) {
            b.setEnabled(false);
        }
    }
    
}
