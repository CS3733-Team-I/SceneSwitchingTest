package testapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PathfindingSidebarController {
    @FXML TextField tb1;
    @FXML TextField tb2;

    @FXML
    void onNavigatePressed() {
        System.out.println(String.format("Textbox 1: %s\nTextbox 2: %s\n", tb1.getText(), tb2.getText()));
    }
}
