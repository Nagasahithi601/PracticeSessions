package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bus", "car","auto","bus","car","bicycle");
        List<String> ls =list.stream().distinct().collect(Collectors.toList());
        System.out.println(ls);

       long countNumber = list.stream().distinct().count();
        System.out.println(countNumber);



    }

}
