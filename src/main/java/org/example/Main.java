package org.example;
import java.awt.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuItem eggs = new MenuItem("eggs");
        HashMap<Integer, MenuItem> breakfastItems = new HashMap();
        breakfastItems.put(1, eggs);

        Menu breakfast = new Menu(breakfastItems);

//            ArrayList<Double> price = new ArrayList<>();
//            ArrayList<String> description = new ArrayList<>();
//            ArrayList<String> category = new ArrayList<>();


    }
}