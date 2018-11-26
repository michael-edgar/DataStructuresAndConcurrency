package Lab9.ScrollingText;

//Scroller without threads
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Cathryn
 */

public class Scroller {
    private String text;
    private JPanel panel;

    public Scroller (JPanel p) {
        panel = p;
        text = new String("Visit the Wild Atlantic Way ");
    }

    public void run() {
        draw();
        while (true) {
            move();
            delay();
        }
    }

    private void draw() {
        Graphics g = panel.getGraphics();
        g.setColor(Color.black);
        g.drawString(text, 10, 20);
        g.dispose();
    }

    private void move() {
        Graphics g = panel.getGraphics();
        Color c = panel.getBackground();
        g.setColor(c);
        g.drawString(text, 10, 20);

        text = text.substring(1, text.length())
                + text.substring(0, 1);

        g.setColor(Color.black);
        g.drawString(text, 10, 20);
        g.dispose();
    }

    private void delay() {
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            return;
        }
    }
}


