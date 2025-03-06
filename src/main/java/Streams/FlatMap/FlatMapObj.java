package Streams.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int id;
    char grade;

    Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;

    }
}

public class FlatMapObj {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<Student>();
        list1.add(new Student("Ayyappa", 101, 'A'));
        list1.add(new Student("Sahithi", 102, 'B'));
        list1.add(new Student("Manju", 103, 'A'));

        List<Student> list2 = new ArrayList<Student>();
        list1.add(new Student("Jaya", 104, 'A'));
        list1.add(new Student("Anil", 107, 'B'));
        list1.add(new Student("Chandana", 110, 'A'));

        List<List<Student>> totalList = Arrays.asList(list1, list2);

        List<Integer> lists = totalList.stream().flatMap(n -> n.stream().map(std -> std.id)).collect(Collectors.toList());
        System.out.println(lists);
        List<String> lists1 = totalList.stream().flatMap(n -> n.stream().map(std -> std.name)).collect(Collectors.toList());
        System.out.println(lists1);

    }
}
