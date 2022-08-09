package com.example.arcadegamenew.Pong;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    GamePanel panel;

    public GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("PongGame");
        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
