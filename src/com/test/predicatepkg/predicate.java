package com.test.predicatepkg;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {

        // Creating predicate
        Predicate<Integer> lessthan = i -> (i < 20);
        // Calling Predicate method
        System.out.println(lessthan.test(12));

    }
}
