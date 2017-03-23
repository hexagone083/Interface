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

/**
 *
 * @author florian
 */
public class LignesSauvegardes {

    private final Stack<Point> liste = new Stack<>();

    public LignesSauvegardes(Stack l) {
        liste.addAll(l);
    }

    public void repaint(Graphics g) {
        g.setColor(Color.RED);
        for (int i = 0; i < liste.size() -1 ; i++) {
            g.drawLine(liste.get(i).x, liste.get(i).y,
                    liste.get(i + 1).x, liste.get(i + 1).y);
        }
    }
}
