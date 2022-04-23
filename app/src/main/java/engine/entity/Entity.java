package engine.entity;

import engine.utils.Position;

public class Entity {
    private Position position;

    public Entity(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void move(int dx, int dy) {
        position = position.move(dx, dy);
    }
}
