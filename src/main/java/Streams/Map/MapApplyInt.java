package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapApplyInt {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 9, 5, 4, 8, 2);
       List<Integer> list = ls.stream().map(n->n*3).collect(Collectors.toList());
        System.out.println(ls);
        System.out.println(list);
        ls.stream().map(n->n*3).forEach(n-> System.out.println(n));
        ls.stream().map(n->n*3).forEach(System.out::println);
    }
}
