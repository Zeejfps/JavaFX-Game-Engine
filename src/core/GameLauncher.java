package core;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import testing.TestGame;

public class GameLauncher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        TestGame game = new TestGame();
        Canvas canvas = game.getCanvas();

        Group root = new Group();
        root.getChildren().add(canvas);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, canvas.getWidth(), canvas.getHeight()));
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        primaryStage.show();

        game.start();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
