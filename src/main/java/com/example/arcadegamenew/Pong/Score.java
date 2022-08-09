package com.example.arcadegamenew.Pong;

import java.awt.*;
import java.awt.geom.Line2D;


public class Score extends Rectangle{

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw (Graphics g){
        g.setColor(new Color(117, 117, 206));
        g.setFont(new Font("Consolas", Font.BOLD,60));

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(6));
        g2.draw(new Line2D.Float(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT));
        g2.setColor(new Color(153,153,255));

        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
/*
        GamePanel obj = new GamePanel();
        g.drawString("Match Complete. "  + String.valueOf(obj.winner) + " wins!", GAME_WIDTH/2-450, 200);*/

    }

}
