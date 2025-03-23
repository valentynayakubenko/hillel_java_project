package homework13;

import java.util.TreeSet;

public class Task8 {

    public static TreeSet<Integer> mergedLists(TreeSet<Integer> first, TreeSet<Integer> second) {
        TreeSet<Integer> mergedList = new TreeSet<>(first);
        mergedList.addAll(second);
        return mergedList;
    }

    public static void main(String[] args) {
        TreeSet<Integer> first = new TreeSet<>();
        first.add(1);
        first.add(2);
        first.add(3);

        TreeSet<Integer> second = new TreeSet<>();
        second.add(3);
        second.add(5);
        second.add(6);

        TreeSet<Integer> mergedList = mergedLists(first, second);
        System.out.println(mergedList);
    }
}
