package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class UserHomeScreenJ {
    @FXML
    public void Back(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("fxmlFiles/MainPage.fxml")));
        Scene viewScene = new Scene(viewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(viewScene);
        window.show();
    }

    @FXML
    public void Easy (){
        new GamePlay();
    }

    @FXML
    public void Medium (){
        new GamePlay1();
    }
    @FXML
    public void Expert (){
        new GamePlay2();
    }
    @FXML
    public void Leaderboard(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("fxmlFiles/Leaderboard.fxml")));
        Scene viewScene = new Scene(viewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(viewScene);
        window.show();
    }
}
