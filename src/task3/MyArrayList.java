package task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        //       создать динамический массив
        ArrayList<Integer> numb = new ArrayList<>();
        numb.add(2);
        numb.add(4);
        numb.add(6);
        numb.add(8);
        numb.add(99);
        //Добавить 5 элементов
        numb.add(1, 7);
        numb.add(2, 9);
        numb.add(3, 11);
        numb.add(4, 13);
        numb.add(5, 100);
        System.out.println(numb);
        //умножить 1й и последний индексы

        // first index
        System.out.println(numb.get(1));
        // second index
        System.out.println(numb.size());
        int multi = numb.get(1) * numb.get(numb.size()-1);
        System.out.println(multi);
        numb.set(1, multi);
        System.out.println(numb);
        Collections.sort(numb);
        System.out.println(numb);


        }

    }




//        }
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(0) + " " + arrayList.get(99));
//        System.out.println(arrayList.size());
//
//        for (int i = 0; i< arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        for (Integer x: arrayList)
//            System.out.println(x);
//
//    }

