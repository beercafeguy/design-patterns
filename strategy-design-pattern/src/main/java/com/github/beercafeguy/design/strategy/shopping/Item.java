package com.github.beercafeguy.design.strategy.shopping;

public class Item {
    private int itemId;
    private String itemName;
    private Double itemPrice;

    public Item(int itemId, String itemName, Double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (itemId != item.itemId) return false;
        if (itemName != null ? !itemName.equals(item.itemName) : item.itemName != null) return false;
        return itemPrice != null ? itemPrice.equals(item.itemPrice) : item.itemPrice == null;
    }

    @Override
    public int hashCode() {
        int result = itemId;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (itemPrice != null ? itemPrice.hashCode() : 0);
        return result;
    }
}
