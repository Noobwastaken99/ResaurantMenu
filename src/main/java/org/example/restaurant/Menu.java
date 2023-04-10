package org.example.restaurant;
import java.util.Date;
import java.util.*;
import java.util.Scanner;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items) {
        this.lastUpdated = new Date();
        this.items = items;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.lastUpdated = new Date();
        this.items = items;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void addMenuItem(MenuItem menuItem) {
        this.lastUpdated = new Date();
        this.items.add(menuItem);
    }
    public void removeMenuItem(MenuItem menuItem) {
        this.lastUpdated = new Date();
        this.items.remove(menuItem);
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public void printFullMenu() {
        this.items.forEach((menuItem) -> System.out.println(menuItem.toString()));
    }
}
