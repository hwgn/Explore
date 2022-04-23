package engine.item.weapon.melee;

import engine.entity.Entity;
import engine.item.weapon.Weapon;

public class MeleeWeapon extends Weapon {
    protected static final double DAMAGE_MULTIPLIER = 0.3;

    private final int nearRangeBonus;
    private final int maxRange;

    public MeleeWeapon(String name, String description, int weight, int damage, int speed, int nearRangeBonus, int maxRange) {
        super(name, description, weight, damage, speed);
        this.nearRangeBonus = nearRangeBonus;
        this.maxRange = maxRange;
    }

    @Override
    public double attack(Entity source, Entity target) {
        double distance = source.getPosition().distance(target.getPosition());

        if (distance > maxRange) throw new IllegalStateException("Target is too far away");

        return damage * (rand.nextDouble() * DAMAGE_MULTIPLIER + 1) // random damage multiplier
                + nearRangeBonus * (((double) maxRange - distance) / (double) maxRange); // bonus for distance
    }
}
