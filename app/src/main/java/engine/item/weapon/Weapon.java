package engine.item.weapon;

import engine.item.Item;

public abstract class Weapon extends Item {
    private int damage;
    private int speed;
    private final int value;

    public Weapon(String name, int weight, int baseDamage, int baseSpeed, int baseValue) {
        super(name, weight);
        this.baseDamage = baseDamage;
        this.baseSpeed = baseSpeed;
        this.baseValue = baseValue;

    }
}
