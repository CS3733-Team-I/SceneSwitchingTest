package testapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {

    @FXML Button adminButton;
    @FXML Button pathfindingButton;

    public MainWindowController() throws IOException {
    }

    @FXML
    public void adminButtonClicked() throws IOException {
        Stage primaryStage = (Stage)adminButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/testapp/view/MainWindowAdminView.fxml"));
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    @FXML
    public void pathfindingButtonClicked() throws IOException {
        Stage primaryStage = (Stage)pathfindingButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/testapp/view/MainWindowPathfindingView.fxml"));
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
