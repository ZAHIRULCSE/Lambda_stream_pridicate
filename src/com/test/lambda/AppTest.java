package com.test.lambda;

import java.util.ArrayList;

public class AppTest {
    public static void main(String[] args) {

        InitPross fobj = (int x) -> System.out.println("calculate no:" + 2 * x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);


        System.out.print("Add: ");
        Initi2Process obj2 = (int x, int y) -> System.out.println(x + y);
        //This is called from Initi2Process Interface.
        obj2.add(20, 10);

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println("Writing the all the input number");
        arrayList.forEach(n -> System.out.println(n));
        System.out.println("After filter the even No.");
        arrayList.forEach(n -> {
            if (n % 2 == 0) System.out.println(n);
        });


    }
}
