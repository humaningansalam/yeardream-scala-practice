package org.yeardream.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class examList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());


        Collections.sort(list);
        System.out.println(list);

//        list.remove(4);
//        System.out.println(list);

        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 5;
        intArr[2] = 4;

        int[] intArr2 = new int[5];
        intArr2[0] = intArr[0];
        intArr2[1] = intArr[1];
        intArr2[2] = intArr[2];
        intArr2[3] = 11;
        intArr2[4] = 10;

        for (int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for (int cur : list ){
            System.out.println(cur);
        }
    }
}
