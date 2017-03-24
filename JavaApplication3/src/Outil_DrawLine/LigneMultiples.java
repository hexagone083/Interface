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
    private final ligneSauvegarde lignes_sauvegardees = new ligneSauvegarde();

    public void ajouterPoint(Point p) {
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
        lignes_sauvegardees.ajouteSauvegarde(liste);
   
        liste = new Stack <> ();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Trace les lignes sauvegardées
        if (point_temporaire != null) {
            g.drawLine(liste.lastElement().x, liste.lastElement().y,
                    point_temporaire.x, point_temporaire.y);
        }
        //trace les lignes trécées en cours
        g.setColor(couleur);
        for (int i = 0; i < liste.size() - 1; i++) {
            g.drawLine(liste.get(i).x, liste.get(i).y,
                    liste.get(i + 1).x, liste.get(i + 1).y);
        }
        //Tracage de la ligne temporaire
        lignes_sauvegardees.repaint(g);

        point_temporaire = null;

    }

}
