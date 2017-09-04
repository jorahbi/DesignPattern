import design.pattern.filter.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sky on 2017/9/1.
 */
public class Filter {

    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria criteriaFemale = new CriteriaFemale();
        Criteria criteriaMale = new CriteriaMale();
        Criteria orCriteria = new OrCriteria(criteriaFemale, criteriaMale);
        Criteria andCriteria = new AndCriteria(criteriaFemale, criteriaMale);
        System.out.println("female");
        printPersons(criteriaFemale.meetCriteria(persons));
        System.out.println("\nmale");
        printPersons(criteriaMale.meetCriteria(persons));
        System.out.println("\nor");
        printPersons(orCriteria.meetCriteria(persons));
        System.out.println("\nand");
        printPersons(andCriteria.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
