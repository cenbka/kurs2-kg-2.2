package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class DrawPanel extends JPanel {

    public static void DrawSun(Graphics g, int x, int y, int r, int R, int n, Color color) {
        g.setColor(color);
        g.fillOval(x - r , y - r, r + r ,r + r);
        double da = 2*Math.PI/n;
        for (int i = 0; i < n; i ++ ) {
            double dx1 = r * Math.cos(da * i );
            double dy1 = r * Math.sin(da * i );
            double dx2 = R * Math.cos(da * i );
            double dy2 = R * Math.sin(da * i );
            g.drawLine((int)dx1+x, (int)dy1+y, (int)dx2+x,(int)dy2+y);

        }
    }

    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        gr.drawRect(0 ,0,800,200);
        gr.setColor(new Color (0, 255 ,255));
        gr.fillRect(0,0,800,200);
        DrawSun(gr, 100, 100, 50, 80, 100, Color.yellow);

        gr.setColor(Color.BLUE);
        gr.drawRect(0, 150,800,200);
        gr.fillRect(0,150,800,200);

        gr.setColor(Color.YELLOW);
        gr.drawRect(0, 350,800,250);
        gr.fillRect(0,350,800,250);

       // gr.setColor(new Color (0 ,100,0));


        gr.setColor(Color.WHITE);
        gr.fillPolygon(new int[] {300, 340 , 340}, new int[] {200, 245, 200}, 3);
        gr.drawRect(340,200, 180,45);
        gr.fillRect(340,200,180,45);
        gr.fillPolygon(new int[] {520, 520, 560}, new int[] {200, 245, 200},3 );
        gr.setColor(Color.black);
        gr.fillPolygon(new int[] {400, 420 , 420}, new int[] {200, 165, 200}, 3);
        gr.drawRect(420, 165, 30,35);
        gr.fillRect(420, 165, 30,35);
        gr.drawRect(500,160,5,40);
        gr.fillRect(500,160,5,40);
        gr.drawRect(500, 130, 50, 30);
        gr.setColor(Color.WHITE);
        gr.fillRect(501,131,49,9);
        gr.setColor(Color.blue);
        gr.fillRect(501,140,49,10);
        gr.setColor(Color.RED);
        gr.fillRect(501,150,49,9);

       /* gr.fillPolygon(new int[] {335, 350 , 365}, new int[] {420, 400, 420}, 3);
        gr.fillPolygon(new int[] {325, 350 , 375}, new int[] {440, 417, 440}, 3);
        gr.fillPolygon(new int[] {320, 350 , 380}, new int[] {460, 437, 460}, 3); */



        gr.setColor((Color.BLACK));
        gr.drawOval(100, 400, 14, 20);
        gr.fillOval(100, 400, 14, 20);
        gr.drawRect(105,420,3,20);
        gr.fillRect(105, 420,3 , 20);
        gr.drawLine(105, 422, 90, 415);
        gr.drawLine(108, 422, 123, 430);
        gr.drawLine(105, 440, 103, 460);
        gr.drawLine(107, 440, 109, 460);

        // кораблик машинка человечка зонтики или лежаки







    }
}
