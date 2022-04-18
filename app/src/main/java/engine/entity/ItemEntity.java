package engine.entity;

import engine.item.Item;
import engine.utils.Position;

public class ItemEntity extends Entity {
    private final Item item;

    public ItemEntity(Item item, Position position) {
        super(position);
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}

