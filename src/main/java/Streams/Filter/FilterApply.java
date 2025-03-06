package Streams.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterApply {
    public static void main(String[] args) {
        /*ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(15);
        al.add(25);
        al.add(3);
        al.add(56);
        al.add(79);*/
        List<Integer> list = Arrays.asList(10, 37, 53, 64, 86, 93);
       List<Integer> newList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(newList);
        //list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        list.stream().filter(n->n%2==0).forEach(System.out::println);





    }
}
