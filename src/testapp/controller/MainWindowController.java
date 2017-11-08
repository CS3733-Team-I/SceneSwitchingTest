package testapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainWindowController {

    @FXML Button switchButton;
    @FXML Pane contentWindow;

    PathfindingWindowController pathfindingController;
    AdminWindowController adminController;

    enum MainWindowScene {
        PATHFINDING,
        ADMIN
    }

    MainWindowScene currentView = MainWindowScene.PATHFINDING;

    public MainWindowController() throws IOException {
        pathfindingController = new PathfindingWindowController();
        adminController = new AdminWindowController();
    }

    private void switchTo(MainWindowScene scene) {
        switch (scene) {
            case ADMIN:
                currentView = MainWindowScene.ADMIN;
                contentWindow.getChildren().setAll(adminController);
                switchButton.setText("Admin");
                break;

            case PATHFINDING:
                currentView = MainWindowScene.PATHFINDING;
                contentWindow.getChildren().setAll(pathfindingController);
                switchButton.setText("Pathfinding");
                break;
        }
    }

    @FXML
    protected void initialize() {
        this.switchTo(MainWindowScene.PATHFINDING);
    }

    @FXML
    public void switchButtonClicked() throws IOException {
        switch (currentView) {
            case ADMIN:
                this.switchTo(MainWindowScene.PATHFINDING);
                break;
            case PATHFINDING:
                this.switchTo(MainWindowScene.ADMIN);
                break;
        }
    }
}
