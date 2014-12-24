package core;

import core.components.Component;
import core.components.Transform;

import java.util.ArrayList;

/**
 * Created by Zeejfps on 12/23/2014.
 */
public abstract class GameObject {

    private ArrayList<Component> components;
    private Game game;

    public final Transform transform;

    public GameObject(Game game) {
        transform = new Transform();
        components = new ArrayList<Component>();
        components.add(transform);
        this.game = game;
    }

    protected final void updateComponents(long now) {

        for (Component c : components) {
            c.update(now);
        }

    }

    protected abstract void update(long now);

    public Game getGame() {
        return game;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

}
