/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outil_DrawLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author florian
 */
public class ligneSauvegarde {

    private final ArrayList<Stack> liste = new ArrayList<>();

    public void ajouteSauvegarde(Stack l) {
        liste.add(l);
    }

    public boolean estVide(){
        return liste.isEmpty();
    }
    public void repaint(Graphics g) {

        g.setColor(Color.RED);
        for (Stack<Point> pile : liste) {
            System.out.println(pile);
            for (int i = 0; i < pile.size() - 1; i++) {
               
                g.drawLine(pile.get(i).x, pile.get(i).y,
                        pile.get(i + 1).x, pile.get(i + 1).y);
            }
        }

    }
}
