package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

        List<Integer> arrayList = Arrays.asList(2, 4, 6, 7);
        //Before using the stream api on this array.
        System.out.println("Before use the stream result as list:" + arrayList);

        List<Integer> ls = arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        //After check the Even no using Stream API
        System.out.println("Here are the Even no: " + ls);

        List<Integer> ls1 = arrayList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        //After check the Odd no using Stream API
        System.out.println("Here are the Odd no: " + ls1);
    }
}
