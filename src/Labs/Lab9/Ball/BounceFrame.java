package Lab9.Ball;

//Ball without threads

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BounceFrame extends JFrame {

    private JPanel canvas;
    private JButton startButton;
    private JButton stopButton;
    private JButton closeButton;
    private Ball ball;

    public BounceFrame() {
        setSize(300, 200);
        setTitle("Bounce");
        canvas = new JPanel();
        add(canvas, "Center");

        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start");
        closeButton = new JButton("Close");
        stopButton = new JButton("Stop");

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(closeButton);

        ButtonHandler handler = new ButtonHandler();

        startButton.addActionListener(handler);
        stopButton.addActionListener(handler);
        closeButton.addActionListener(handler);

        add(buttonPanel, "South");
    }

    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == startButton) {
                ball = new Ball(canvas);
                Thread ballThread = new Thread(ball);
                ballThread.start();
            }else if (event.getSource() == stopButton) {
                // to be completed
            } else if (event.getSource() == closeButton) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        BounceFrame frame = new BounceFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}