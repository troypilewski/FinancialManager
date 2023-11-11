package com.fm.financemanager;

import com.fm.financemanager.manager.View;
import com.fm.financemanager.manager.ViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        Scene scene = new Scene(fxmlLoader.load());
        Scene scene = new Scene(new Pane());
        ViewManager.setScene(scene);
        ViewManager.switchView(View.MAIN);
        stage.setTitle("Finance Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}