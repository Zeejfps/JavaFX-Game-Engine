package core.components;

import com.sun.javafx.geom.Vec2d;
import com.sun.javafx.geom.Vec3d;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;

/**
 * Created by Zeejfps on 12/23/2014.
 */
public class Transform implements Component {

    public final Vec2d position;
    public final Vec2d scale;
    private double angle;

    private final Rotate t_rotate;
    private final Scale t_scale;

    public Transform() {
        position = new Vec2d(0, 0);
        scale = new Vec2d(1, 1);
        angle = 0;

        t_rotate = new Rotate();
        t_scale = new Scale();
    }

    public void translate(double dx, double dy) {
        position.x += dx;
        position.y += dy;
    }

    public void scale(double sx, double sy) {
        scale.x += sx;
        scale.y += sy;
    }

    public void rotate(double angle) {
        this.angle += angle;
    }

    @Override
    public void update(long now) {
        t_rotate.setAngle(angle);
        t_rotate.setPivotX(position.x);
        t_rotate.setPivotY(position.y);
        t_scale.setX(scale.x);
        t_scale.setY(scale.y);
    }

    public javafx.scene.transform.Transform getMatrix() {
        return t_scale.createConcatenation(t_rotate);
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

}
