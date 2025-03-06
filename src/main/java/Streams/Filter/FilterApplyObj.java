package Streams.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    int price;
    Product(int id,String name, int price)
    {
        this.id = id;
        this.name= name;
        this.price = price;
    }
}
public class FilterApplyObj {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "Hp", 25000));
        list.add(new Product(2, "Dell", 50000));
        list.add(new Product(3, "MAC", 75000));
        list.add(new Product(4, "Acer", 45678));
       // list.stream().filter(prdt-> prdt.price>=50000).forEach(prd->System.out.println(prd.name));
    List<Integer> lst= list.stream().filter(prd->prd.price>=50000).map(prd->prd.price).collect(Collectors.toList());
        System.out.println(lst);


    }
}
