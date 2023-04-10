package org.example.restaurant;

import java.util.Objects;

public class MenuItem {
    private double price = 999;
    private String description = "None";
    private String category = "N/A";
    private Boolean isNew = false;

    public MenuItem () { }
    public MenuItem (double price) {
        this.price = price;
    }
    public MenuItem (double price, String description) {
        this.price = price;
        this.description = description;
    }
    public MenuItem (double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }
    public MenuItem (double price, String description, String category, Boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    // what mcdev has
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public String getNew() {
        if(this.isNew) {
            return "Is New";
        }
        return "Is Old";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(this.description, menuItem.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
