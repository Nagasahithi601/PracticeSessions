package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> ls = list.stream().filter(n -> n % 2 != 0).max((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(ls.get()); //----------------  9 is output
        Optional<Integer> lst = list.stream().max((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(lst.get());
    }


}


