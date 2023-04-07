package org.example.restaurant;

public class MenuItem {
    private String name;
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

}
