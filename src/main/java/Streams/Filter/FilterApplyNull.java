package Streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterApplyNull {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(null, "Sahithi",null, "Manjusri","AnilK", null,"jaya");

        //result is collected into collection list
        List<String> l = list.stream().filter(str-> str!=null).collect(Collectors.toList());
        System.out.println(l);

        list.stream().filter(str->str!=null).forEach(str-> System.out.println(str));

    }
}
