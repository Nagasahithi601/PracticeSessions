package Streams.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapInt {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 4);
        List<Integer> list2 = Arrays.asList(5, 9, 8);
        List<Integer> list3 = Arrays.asList(4, 7, 6);
        List<List<Integer>> lst = Arrays.asList(list1, list2, list3);
        List<Integer> finalResult = lst.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
        System.out.println(finalResult);

        //we can aslo apply map on that particular stream
        List<Integer> finalResult1 = lst.stream().flatMap(n -> n.stream().map(n1->n1+5)).collect(Collectors.toList());
        System.out.println(finalResult1);


    }
}
