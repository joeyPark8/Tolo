package tolo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    Main() {
        JFrame frame = new JFrame();
        frame.setSize(640, 480);
        frame.setLocation(150, 150);
        frame.setTitle("tolo");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setLayout(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Label label = new Label();
        label.setBounds(frame.getWidth() / 2 - 50, frame.getHeight() / 2 - 50, 150, 20);
        label.setText("Hello :D");
        label.setVisible(false);
        frame.add(label);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(frame.getWidth() / 2 - 50, frame.getHeight() / 2, 100, 25);
        frame.add(passwordField);

        TextField field = new TextField();
        field.setBounds(frame.getWidth() / 2 - 50, frame.getHeight() / 2 - 25, 100, 25);
        frame.add(field);

        Button button = new Button();
        button.setBounds(frame.getWidth() / 2 + 55, frame.getHeight() / 2 - 20, 70, 35);
        button.setLabel("log in");
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (field.getText().equalsIgnoreCase("semin123")) {
                    if (passwordField.getText().equalsIgnoreCase("psm135790.1")) {
                        System.out.println("id: " + field.getText());
                        System.out.println("password: " + passwordField.getText());
                        System.out.println("-----welcome-----");
                        field.setText("");
                        passwordField.setText("");
                        label.setVisible(false);

                        JFrame frame2 = new JFrame();
                        frame2.setSize(640, 480);
                        frame2.setLocation(800, 150);
                        frame2.setTitle("tolo (manage)");
                        frame2.setResizable(false);
                        frame2.setVisible(true);
                        frame2.setAlwaysOnTop(true);
                        frame2.setLayout(null);
                        frame2.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosing(WindowEvent e) {
                                System.exit(0);
                            }
                        });
                    }
                    else {
                        label.setVisible(true);
                        label.setBackground(Color.red);
                        label.setText("id or password is wrong");
                        field.setText("");
                        passwordField.setText("");
                    }
                }
                else {
                    label.setVisible(true);
                    label.setBackground(Color.red);
                    label.setText("id or password is wrong");
                    field.setText("");
                    passwordField.setText("");
                }
            }
        });
        frame.add(button);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
