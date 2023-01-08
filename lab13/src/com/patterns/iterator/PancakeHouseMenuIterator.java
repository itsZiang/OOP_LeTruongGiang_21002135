package com.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    private List<String> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}