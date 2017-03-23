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
    private final Stack<Point> liste = new Stack<>();
    private Color couleur;
    private Point point_temporaire;

    public void ajouterPoint(Point p) {
        System.out.println("Add point. size: " + liste.size());
        liste.add(p);
    }

    public void supprimePremier() {
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

    public void setPoint_temporaire(Point point_temporaire) {
        this.point_temporaire = new Point(point_temporaire);
    }
      public void sauvegarde() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(couleur);
        for (int i = 0; i < liste.size() - 1; i++) {
            g.drawLine(liste.get(i).x, liste.get(i).y,
                    liste.get(i + 1).x, liste.get(i + 1).y);
        }
        //Tracage de la ligne temporaire
        if (point_temporaire != null) {
            g.drawLine(liste.lastElement().x, liste.lastElement().y,
                    point_temporaire.x, point_temporaire.y);
        }
        point_temporaire = null;

    }

  

}
