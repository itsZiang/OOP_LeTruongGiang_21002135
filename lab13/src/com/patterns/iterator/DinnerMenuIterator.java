package com.patterns.iterator;

public class DinnerMenuIterator implements Iterator {
    private String[] items;
    private int position = 0;

    public DinnerMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return (!(position >= items.length || items[position] == null));
    }

    @Override
    public Object next() {
        return items[position++];
    }
}
