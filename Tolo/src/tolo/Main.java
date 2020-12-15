package tolo;

import java.awt.*;
import java.awt.event.*;

public class Main {
    int num = 0;

    Main() {
        Frame frame = new Frame();
        frame.setTitle("Tolo");
        frame.setSize(640, 480); //4:3
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setLocation(150, 150);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Label lbl = new Label();
        lbl.setText("" + 0);
        lbl.setBounds(frame.getWidth() / 2 - 35, frame.getHeight() / 2 - 70, 70, 50);
        frame.add(lbl);

        Button btn = new Button();
        btn.setBounds(frame.getWidth() / 2 - 50, frame.getHeight() / 2 - 20, 100, 40);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setLabel("Click me!");
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                num += 1;
                lbl.setText("" + num);
            }
        });
        frame.add(btn);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
