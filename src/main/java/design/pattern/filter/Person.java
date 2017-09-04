package design.pattern.filter;

/**
 * Created by sky on 2017/9/1.
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName(){
        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

    public String getMaritalStatus(){
        return this.maritalStatus;
    }
}
