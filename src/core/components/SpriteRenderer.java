package core.components;

import core.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.transform.Transform;

/**
 * Created by Zeejfps on 12/23/2014.
 */
public class SpriteRenderer implements Component {

    private Sprite sprite;

    public SpriteRenderer(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override
    public void update(long now) {

        GraphicsContext ctx = sprite.getGame().getCanvas().getGraphicsContext2D();

        ctx.save();
        {
            Transform t = sprite.transform.getMatrix();
            ctx.setTransform(t.getMxx(), t.getMyx(), t.getMxy(), t.getMyy(), t.getTx(), t.getTy());
            ctx.drawImage(sprite.getImage(), sprite.transform.position.x, sprite.transform.position.y);
        }
        ctx.restore();

    }

}
