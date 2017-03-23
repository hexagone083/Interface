/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outil_DrawLine;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Stack;

/**
 *
 * @author florian
 */
public class LignesMultiple2 {

    private final Stack<Point> multiLigne = new Stack<>();

    public LignesMultiple2(Stack l) {
        multiLigne.addAll(l);
    }

    public void repaint(Graphics g) {
        for (int i = 0; i < multiLigne.size() - 1; i++) {
            g.drawLine(multiLigne.get(i).x, multiLigne.get(i).y,
                    multiLigne.get(i + 1).x, multiLigne.get(i + 1).y);
        }
    }
}
