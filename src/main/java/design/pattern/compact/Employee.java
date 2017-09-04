package design.pattern.compact;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    public void remove(Employee e){
        this.subordinates.remove(e);
    }

    public void add(Employee e){
        this.subordinates.add(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
