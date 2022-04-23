package engine.item.weapon;

import engine.entity.Entity;
import engine.item.Item;

public abstract class Weapon extends Item {
    protected static final double DAMAGE_MULTIPLIER = 0.0; // max damage multiplier

    protected int damage;
    protected int speed;

    public Weapon(String name, String description, int weight, int baseDamage, int baseSpeed) {
        super(name, description, weight);
        this.damage = baseDamage;
        this.speed = baseSpeed;
    }

    public double attack(Entity source, Entity target) {
        return damage * (rand.nextDouble() * DAMAGE_MULTIPLIER + 1);
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
