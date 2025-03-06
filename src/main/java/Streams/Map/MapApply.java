package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapApply {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ayyappa", "sahithi", "jaya", "anil", "manju");
       List<String> ls = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls);
        //list.stream().map(str->str.toUpperCase()).forEach(str-> System.out.println(str));
        //list.stream().map(str->str.toUpperCase()).forEach(System.out::println);


        List<Integer> lst = list.stream().map(str -> str.length()).collect(Collectors.toList());
        System.out.println(lst);
        //list.stream().map(vname -> vname.length()).forEach(str-> System.out.println(str));

    }
}
