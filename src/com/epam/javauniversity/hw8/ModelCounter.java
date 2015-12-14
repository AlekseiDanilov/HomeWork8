package com.epam.javauniversity.hw8;

import java.util.ArrayList;
import java.util.Iterator;

public class ModelCounter {

    private ArrayList<Integer> humans;

    public ModelCounter(int numberHumans) {
        if (numberHumans < 2) {
            throw new IllegalArgumentException("number humans < 2");
        }
        humans = new ArrayList<>();
        for (int i = 0; i < numberHumans; i++) {
            humans.add(new Integer(i + 1));
        }
    }

    public Integer demonstrateAndReturnLast() {
        ArrayList<Integer> copyHumans = new ArrayList<>(humans);
        Iterator<Integer> iterator = copyHumans.listIterator();
        int count = 1;
        print(copyHumans);
        while (copyHumans.size() > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                if (count % 2 == 0) {
                    iterator.remove();
                }
                count++;
            } else {
                iterator = copyHumans.listIterator();
                print(copyHumans);
            }
        }
        print(copyHumans);
        return copyHumans.get(0);
    }

    public void print(ArrayList<Integer> humans) {
        if (humans == null) {
            throw new IllegalArgumentException("humans is null");
        }
        for (Integer human : humans) {
            System.out.print(human + "\t");
        }
        System.out.println();
    }
}
