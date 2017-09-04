package design.pattern.filter;

import java.util.List;

/**
 * Created by sky on 2017/9/1.
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = this.criteria.meetCriteria(persons);
        List<Person> other = this.otherCriteria.meetCriteria(persons);
        for (Person person : other){
            if(!first.contains(person)){
                first.add(person);
            }
        }
        return first;
    }
}
