package week3;

import java.util.ArrayList;

public class Exercise67 {
    public static double variance(ArrayList<Integer> list) {
        double sumMinusAverage = sum(list) - average(list);
        double variant = 1 / (list.size() - 1) * Math.pow(sumMinusAverage, 2);
        return Math.sqrt(variant);
    }

    public static double sum(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double average = sum(list) / list.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
