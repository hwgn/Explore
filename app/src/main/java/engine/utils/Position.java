package engine.utils;

public record Position (int x, int y) {

    public Position move(int x, int y) {
        return new Position(this.x + x, this.y + y);
    }

    public double distance(Position other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}
