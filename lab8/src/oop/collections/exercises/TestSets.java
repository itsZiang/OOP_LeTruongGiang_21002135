package oop.collections.exercises;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> second = new HashSet<>(List.of(3, 4, 5, 6));
        System.out.println(Sets.intersectionManual(first, second));
        System.out.println(Sets.unionManual(first, second));
        System.out.println(Sets.intersection(first, second));
        System.out.println(Sets.union(first, second));
        List<Integer> list = Sets.toList(first);
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        System.out.println(Sets.removeDuplicates(list));
        System.out.println(Sets.removeDuplicatesManual(list));
        System.out.println(Sets.firstRecurringCharacter("abacb"));
        System.out.println(Sets.allRecurringChars("mamma"));
        Integer[] arr = Sets.toArray(first);
        System.out.println(Arrays.toString(arr));
        TreeSet<Integer> treeSet = new TreeSet<>(first);
        System.out.println(Sets.getFirst(treeSet));
        System.out.println(Sets.getLast(treeSet));
        System.out.println(Sets.getGreater(treeSet, 2));
    }
}
