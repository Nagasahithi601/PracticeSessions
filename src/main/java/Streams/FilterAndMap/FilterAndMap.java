package Streams.FilterAndMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int empSalary;
    Employee(int empId, String empName, int empSalary){
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

}
public class FilterAndMap {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        {
            list.add(new Employee(101, "Sahithi", 123454567));
            list.add(new Employee(102, "Ayyappa", 876543234));
            list.add(new Employee(103, "manjusri", 456789876));
        }

        //the below commented line will not work directly filter().collect

        //List<Integer> ls =list.stream().filter(n->n.empSalary>45676).collect(Collectors.toList());
    List<Integer> ls =list.stream().filter(n->n.empSalary>45676).map(e->e.empSalary).collect(Collectors.toList());
        System.out.println(ls);
    }
}
