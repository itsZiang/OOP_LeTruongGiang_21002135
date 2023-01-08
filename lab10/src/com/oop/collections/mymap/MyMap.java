package com.oop.collections.mymap;

public interface MyMap {
    Object get(Object key);

    void put(Object key, Object value);

    void remove(Object key);

    boolean contains(Object key);

    int size();
}
