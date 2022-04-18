package engine.utils;

public record Position (int x, int y, int z) {

    public Position move(int x, int y, int z) {
        return new Position(this.x + x, this.y + y, this.z + z);
    }

    public Position move(int x, int y) {
        return move(x, y, 0);
    }
}
