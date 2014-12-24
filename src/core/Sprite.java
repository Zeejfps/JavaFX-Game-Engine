package core;

import core.components.SpriteRenderer;
import javafx.scene.image.Image;

/**
 * Created by Zeejfps on 12/23/2014.
 */
public class Sprite extends GameObject {

    private Image image;

    public Sprite(Game game, Image image) {
        super(game);
        this.image = image;
        getComponents().add(new SpriteRenderer(this));
    }

    @Override
    protected void update(long now) {

    }

    public Image getImage() {
        return image;
    }

}
