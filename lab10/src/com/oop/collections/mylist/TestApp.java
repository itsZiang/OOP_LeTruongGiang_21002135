package com.oop.collections.mylist;

import com.oop.collections.polynomials.ArrayPoly;

public class TestApp {
    public static void main(String[] args) {
        MyList l = new MyArrayList();
        l.add("a", 0);
        l.add("b");
        l.add("c", 0);
        l.add("c", 3);
        l.remove(3);
        System.out.println(l.size());
        System.out.println(l);
    }
}
