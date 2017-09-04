package design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sky on 2017/9/1.
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> meetPersons = new ArrayList<Person>();

        for(Person person : persons){
            if("MALE".equalsIgnoreCase(person.getGender())){
                meetPersons.add(person);
            }
        }
        return meetPersons;
    }
}
