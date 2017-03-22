/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outils;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author florian
 */
public class Feu extends JPanel {

    private Color couleur_allume;
    private final Color couleur_eteint = Color.BLACK;
    private boolean est_allume = false;

    public void allume() {
        est_allume = true;
        repaint();
    }

    public void eteindre() {
        est_allume = false;
        repaint();
    }

    public void setCouleur_allume(Color couleur_allume) {
        this.couleur_allume = couleur_allume;
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        if (est_allume) {
            g.setColor(couleur_allume);
        } else {
            g.setColor(couleur_eteint);
        }
        g.fillOval(0, 0, getWidth(), getHeight());
    }

}
