package Streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterApplyStr {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AyyappaKondra", "Sahithi","Manjusri","AnilK","JayaPavuluri");

        //result is collected into collection list
        List<String> l = list.stream().filter(str->str.length()>4 && str.length()<9).collect(Collectors.toList());
        System.out.println(l);

//without collecting the elements into collection, directly printing to console
       list.stream().filter(str->str.length()>4 && str.length()<9).forEach(str-> System.out.println(str));

       //directly printing to console by using method reference(alternate of lambda expressions)
       list.stream().filter(str->str.length()>4 && str.length()<9).forEach(System.out::println);
    }
}
