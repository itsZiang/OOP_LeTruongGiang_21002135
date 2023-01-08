package com.patterns.iterator;

import java.util.List;

public class Cafe {
    public static void main(String[] args) {
        System.out.println("\nMENU\n-- --\nBREAKFAST");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (String item : breakfastItems) {
            System.out.println(item);
        }

        System.out.println("\nLUNCH");
        DinnerMenu dinnerMenu = new DinnerMenu();
        String[] lunchItems = dinnerMenu.getMenuItems();
        for (String item : lunchItems) {
            System.out.println(item);
        }

        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("\nMENU (with iterator)\n-- --\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String menuItem = (String) iterator.next();
            System.out.println(menuItem);
        }
    }
}
