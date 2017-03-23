/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outil_DrawLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author florian
 */
public class Ligne extends JPanel {

    private Point p1 = new Point();
    private Point p2 = new Point();


    public Point getP1() {
        return p1;
       
    }

    public void setP1(Point p1) {
        this.p1 = p1;
        repaint();
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);

    }
}
