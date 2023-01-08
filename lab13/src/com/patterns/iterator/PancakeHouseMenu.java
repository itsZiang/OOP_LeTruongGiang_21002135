package com.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private ArrayList<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

    }

    public void addItem(String name) {
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    @Override
    public String toString() {
        return "Pancake House Menu";
    }
}
