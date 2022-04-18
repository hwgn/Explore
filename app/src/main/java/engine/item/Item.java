package engine.item;

public class Item {
    private final String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int setWeight(int weight) {
        return this.weight = weight;
    }

    @Override
    public String toString() {
        return name;
    }
}
