package Engine;

public enum ItemCategory {
    WEAPON (1, 1),
    WEARABLE (2, 1),
    CONSUMABLE(3, 64),
    QUEST_ITEM (4, Integer.MAX_VALUE),
    CURRENCY (5, Integer.MAX_VALUE),
    ENHANCEMENT (6, 16);

    private final int defaultMaxStackSize;
    private final int id;

    ItemCategory(int id, int maxStackSize) {
        this.id = id;
        this.defaultMaxStackSize = maxStackSize;
    }

    public int getMaxStackSize() {
        return defaultMaxStackSize;
    }

    public boolean isStackable() {
        return defaultMaxStackSize > 1;
    }

    public int getId() {
        return id;
    }
}
