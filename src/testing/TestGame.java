package testing;

import core.Game;
import core.Scene;
import core.Sprite;
import javafx.scene.image.Image;

/**
 * Created by Zeejfps on 12/23/2014.
 */
public class TestGame extends Game {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    private core.Scene scene;

    public TestGame() {
        super(WIDTH, HEIGHT);
    }

    @Override
    protected void init() {

        scene = new Scene(this);

        Image image = new Image(TestGame.class.getResourceAsStream("/test.png"));

        setScene(scene);

    }

    @Override
    protected void update(long now) {

    }
}
