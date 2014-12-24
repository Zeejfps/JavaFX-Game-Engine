package core;

import javafx.animation.AnimationTimer;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by Zeejfps on 12/23/2014.
 */
public abstract class Game {

    private Scene scene;
    private Canvas canvas;
    private Loop loop;

    private long time = 0;
    private int frames = 0;

    public Game(int width, int height) {
        canvas = new Canvas(width, height);
        scene = new Scene(this);
        loop = new Loop();
    }

    public void start() {
        init();
        time = System.currentTimeMillis();
        loop.start();
    }

    public void stop() {
        loop.stop();
        System.exit(0);
    }

    public void setScene(Scene scene){
        this.scene = scene;
    }

    public Scene getScene() {
        return scene;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    protected abstract void init();
    protected abstract void update(long now);

    private class Loop extends AnimationTimer {

        @Override
        public void handle(long now) {
            update(now);
            scene.update(now);

            frames++;

            if (System.currentTimeMillis() - time >= 1000) {
                System.out.println("Frames: " + frames);
                frames = 0;
                time = System.currentTimeMillis();
            }

        }

    }

}
