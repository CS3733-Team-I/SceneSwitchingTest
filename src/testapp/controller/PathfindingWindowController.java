package testapp.controller;

import javafx.beans.DefaultProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.SplitPane;

import java.io.IOException;

@DefaultProperty(value = "pathfindingWindow")
public class PathfindingWindowController extends MapWindowController {

    public PathfindingWindowController() throws IOException {
        super();

        getMapController().setParent(this);

        FXMLLoader loader = new FXMLLoader(MapWindowController.class.getResource("/testapp/view/PathfindingSidebarView.fxml"));
        loader.setRoot(getSidebarPane());
        loader.setController(new PathfindingSidebarController());
        loader.load();
    }

    void mapLocationClicked(double x, double y) {
        System.out.println(String.format("Pathfinding Map Clicked: %f %f\n", x, y));
    }

    void mapNodeClicked() {}
}
