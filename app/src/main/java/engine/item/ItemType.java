package engine.item;

import static engine.item.ItemCategory.CURRENCY;

public enum ItemType {

    // Currencies
    GOLD(0, "Gold", CURRENCY, null, null),
    SILVER(1, "Silver", CURRENCY, null, null),

    // Weapons
    WOODEN_SWORD(100, "Wooden Sword", ItemCategory.WEAPON, null, "A simple sword made out of wood.");



    private final int id;
    private final String name;
    private final ItemCategory category;
    private final Integer maxStackSize;
    private final String description;

    ItemType(int id, String name, ItemCategory category, Integer maxStackSize, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.maxStackSize = maxStackSize == null ? category.getMaxStackSize() : maxStackSize;
        this.description = description == null ? "This item has no description." : description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public Integer getMaxStackSize() {
        return maxStackSize;
    }

    public String getDescription() {
        return description;
    }
}
