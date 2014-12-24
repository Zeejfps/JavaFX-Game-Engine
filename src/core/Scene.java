package core;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

/**
 * Created by Zeejfps on 12/23/2014.
 */
public class Scene {

    private final Game game;
    private final ArrayList<GameObject> gameObjects;

    public Scene(Game game) {
        this.game = game;
        gameObjects = new ArrayList<GameObject>();
    }

    public void update(long now) {

        GraphicsContext ctx = game.getCanvas().getGraphicsContext2D();
        ctx.setFill(Color.BLACK);
        ctx.fillRect(0,0, game.getCanvas().getWidth(), game.getCanvas().getHeight());

        for (GameObject obj : gameObjects){

            obj.update(now);
            obj.updateComponents(now);

        }

    }

    public Game getGame() {
        return game;
    }

    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }

}
