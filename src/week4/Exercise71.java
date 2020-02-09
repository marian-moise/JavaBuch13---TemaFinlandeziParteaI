package week4;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise71 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(7);

        list2.add(5);
        list2.add(4);
        list2.add(7);

        combine(list1, list2);

        System.out.println(list1);
    }

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {

        ArrayList<Integer> remove = new ArrayList<>();
        for (int x : second) {
            if (first.contains(x)) {
                remove.add(x);
            }
        }
        second.removeAll(remove);
        first.addAll(second);
    }
}
