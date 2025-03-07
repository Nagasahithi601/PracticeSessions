package Streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaayyappa", "sahithi", "manju", "anil");
        List<String> lst = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(lst);
    }


}
