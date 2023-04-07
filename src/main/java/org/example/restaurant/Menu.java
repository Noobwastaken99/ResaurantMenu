package org.example.restaurant;
import java.sql.Date;
import java.util.*;
import java.util.Scanner;

public class Menu {
    private HashMap<Integer, MenuItem> items;
//    private ArrayList<String> items = new ArrayList<>();
    private Date lastUpdated;

    public Menu(HashMap<Integer, MenuItem> items) {
        this.items = items;
    }
    public void setItems(HashMap<Integer, MenuItem> items) {
        this.items = items;
    }
    public void printMenu() {
        System.out.println();
    }
    public void addNewItem(Integer id, MenuItem item) {
        this.items.put(id, item);
    }
    @Override
    public String toString() {
//        for (Object i : items.values()) {
//            return i;
//        }
        return items.values().toString();
    }

}
