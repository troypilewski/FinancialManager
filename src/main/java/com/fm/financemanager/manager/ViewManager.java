package com.fm.financemanager.manager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

public class ViewManager {
    private static Scene scene;

    public static void setScene(Scene scene) {
        ViewManager.scene = scene;
    }
    public static void loadView(View view) throws IOException {
        Parent root = FXMLLoader.load(ViewManager.class.getResource(view.getFilepath()));
        scene.setRoot(root);
    }
}
