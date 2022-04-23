package engine.item;

import java.util.Random;

public class Item {
    private final String name;
    private final String description;
    private double weight;
    protected Random rand;

    public Item(String name, String description, int weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        rand = new Random();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public double setWeight(int weight) {
        return this.weight = weight;
    }

    @Override
    public String toString() {
        return name;
    }
}
