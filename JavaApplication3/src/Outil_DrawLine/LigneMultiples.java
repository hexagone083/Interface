/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outil_DrawLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Stack;
import javax.swing.JPanel;

/**
 *
 * @author florian
 */
public class LigneMultiples extends JPanel {


    private int nombre_points;
    private Stack<Point> liste = new Stack<>();
    private Color couleur;
    private Point point_temporaire;
    public void ajouterPoint(Point p) {
      liste.add(p);
    }

    public void supprimePremier(){
        liste.pop();
    }

    public int getNombre_points() {
        return nombre_points;
    }

    public void setNombre_points(int nombre_points) {
        this.nombre_points = nombre_points;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(couleur);
        for (int i = 0; i < liste.size() -1; i++) {
           g.drawLine(liste.get(i).x, liste.get(i).y, liste.get(i - 1).x, liste.get(i - 1).y);
        }
       

    }
    

}
