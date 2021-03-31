package tolo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

public class Main {
    Main() {
        JFrame frame = new JFrame();
        frame.setSize(1936, 1056);
        frame.setLocation(0, 0);
        frame.setTitle("Tolo");
        frame.setResizable(true);
        frame.setVisible(true);
        //frame.setAlwaysOnTop(true);
        frame.setLayout(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        int labelWith = 100, labelHeight = 50;
        Label label = new Label();
        label.setBounds(frame.getWidth() / 2 - labelWith / 2, frame.getHeight() / 2 - labelHeight / 2, labelWith, labelHeight);
        label.setText("Not available");

        JFXPanel jfxPanel_korean1 = new JFXPanel();
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://ebook.mirae-n.com/@kb2054/cover");
            jfxPanel_korean1.setScene(new Scene(webView));
        });

        JFXPanel jfxPanel_korean2 = new JFXPanel();
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://ebook.mirae-n.com/@kb2368/cover");
            jfxPanel_korean2.setScene(new Scene(webView));
        });

        JFXPanel jfxPanel_history1 = new JFXPanel();
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://ebook.mirae-n.com/@kb3811/cover");
            jfxPanel_history1.setScene(new Scene(webView));
        });

        JFXPanel jfxPanel_science = new JFXPanel();
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://webdt.edunet.net/viewer/");
            jfxPanel_science.setScene(new Scene(webView));
        });

        JFXPanel jfxPanel_english = new JFXPanel();
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://webdt.edunet.net/viewer/");
            jfxPanel_english.setScene(new Scene(webView));
        });

        JTabbedPane tab = new JTabbedPane();
        tab.setBounds(0, 0, frame.getWidth(), frame.getHeight() - 20);
        tab.setVisible(true);
        tab.addTab("국어2-1", jfxPanel_korean1);
        tab.addTab("국어2-2", jfxPanel_korean2);
        tab.addTab("수학2", label);
        tab.addTab("역사1", jfxPanel_history1);
        tab.addTab("과학2", jfxPanel_science);
        tab.addTab("영어2", jfxPanel_english);

        frame.add(tab);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
