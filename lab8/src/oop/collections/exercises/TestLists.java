package oop.collections.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Lists.insertFirst(list, 1);
        System.out.println(list);
        Lists.insertLast(list, 2);
        Lists.insertLast(list, 2);
        Lists.insertLast(list, 666);
        System.out.println(list);
        Lists.replace(list, 3);
        System.out.println(list);
        Lists.removeThird(list);
        System.out.println(list);
        Lists.removeEvil(list);
        System.out.println(list);
        ArrayList<Integer> listSquare = Lists.generateSquare();
        System.out.println(listSquare);
        System.out.println(Lists.contains(list, 1));
        System.out.println(Lists.contains(list, 10));
        Lists.copy(list, listSquare);
        System.out.println(listSquare);
        Lists.reverse(list);
        System.out.println(list);
        Lists.reverseManual(list);
        System.out.println(list);
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        Lists.insertBeginningEnd(linkedList, 0);
        System.out.println(linkedList);
    }
}
