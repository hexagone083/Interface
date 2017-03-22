/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

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
    private boolean isAllume = false;

    private void allume(Color couleur) {
        isAllume = true;
        this.couleur_allume = couleur;
        repaint();
    }

    private void eteindre() {
        isAllume = false;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        if (isAllume) {
            g.setColor(couleur_allume);
        } else {
            g.setColor(couleur_eteint);
        }
    }

}
