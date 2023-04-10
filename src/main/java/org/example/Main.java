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
        MenuItem newItem1 = new MenuItem(4, "Garlic linguine", "Dinner", true);
        MenuItem newItem2 = new MenuItem(-5, "Really good steak", "Dinner", false);
        MenuItem newItem3 = new MenuItem(6, "Delicious wings", "Appetizer", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> staringMenu = new ArrayList<>();
        staringMenu.add(newItem1);
        staringMenu.add(newItem2);
        staringMenu.add(newItem3);

        //System.out.println(newItem1.toString());

        Menu ourMenu = new Menu(staringMenu);

        ourMenu.printFullMenu();

//        ourMenu.addMenuItem(newItem1);
//        ourMenu.addMenuItem(newItem2);
//        ourMenu.addMenuItem(newItem3);

//        ourMenu.printMenu();
//        ourMenu.printItem(newItem2);
//        ourMenu.printItem(newItem3);
//        ourMenu.printMenu();
    }
}