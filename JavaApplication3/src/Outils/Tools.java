/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outils;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

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
     * Multi start for timmers.
     *
     * @param t
     */
    public static void activerTimers(Timer... t) {
        for (Timer timer : t) {
            timer.start();
        }
    }

    /**
     * Multi stop for timmers.
     *
     * @param t
     */
    public static void desactiverTimers(Timer... t) {
        for (Timer timer : t) {
            timer.stop();
        }
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
    
    public static void setIcone(String path, JFrame j){
        try {
            j.setIconImage(ImageIO.read(new File(path)));
        } catch (IOException ex) {
            System.out.println("Logo non trouvé!");
        }
    }

}
