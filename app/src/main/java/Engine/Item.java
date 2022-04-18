package Engine;

public class Item {
    private ItemType type;
    private int amount;
    private int level;
    private int xp;

    public Item(ItemType type, int amount, int level) {
        this.type = type;
        this.amount = amount;
        this.level = level;
    }

    public Item(ItemType type, int amount) {
        this(type, amount, 0);
    }

    public Item(ItemType type) {
        this(type, 1);
    }

    public ItemType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public int getLevel() {
        return level;
    }

    public void enhance(Item enhancementItem) {
        if (enhancementItem.getType().getCategory() != ItemCategory.ENHANCEMENT // enhancement item
                && enhancementItem.getType() != this.getType()) // same item
            throw new IllegalArgumentException("Item is not an enhancement item and is not the same type as the item to be enhanced.");

        if (enhancementItem.getType().getCategory() == ItemCategory.ENHANCEMENT) {

        }
    }
}
