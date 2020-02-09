package week3;

import java.util.ArrayList;

public class Exercise65 {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> listInts = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i).length();
            listInts.add(temp);
        }
        return listInts;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }

}
