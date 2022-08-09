package com.example.arcadegamenew;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.example.arcadegamenew.TicTacToe.*;
import com.example.arcadegamenew.Pong.*;

public class HelloController {

    @FXML
    public void onPongButtonClicked(ActionEvent actionEvent) {
        GameFrame panel = new GameFrame();
    }

    public void onTicTacToeButtonClicked(ActionEvent actionEvent) {
        TicTacToe ticTacToe = new TicTacToe();
    }

    public void exitApp(ActionEvent actionEvent) {
        System.exit(0);
    }
}