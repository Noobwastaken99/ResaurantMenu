package org.example;
import java.awt.*;
import java.util.Date;
import java.util.Calendar;
import java.util.*;
import java.util.Scanner;
import org.example.restaurant.Menu;
import org.example.restaurant.MenuItem;

public class Main {
    public static void main(String[] args) {
        MenuItem newItem1 = new MenuItem(4.99, "Garlic linguine", "Dinner", true);
        MenuItem newItem2 = new MenuItem(6.99, "Really good steak", "Dinner", false);
        MenuItem newItem3 = new MenuItem(2.99, "Delicious wings", "Appetizer", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> staringMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, staringMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        ourMenu.printMenu();
        ourMenu.printItem(newItem2);
        ourMenu.printItem(newItem3);
        ourMenu.printMenu();
    }
}