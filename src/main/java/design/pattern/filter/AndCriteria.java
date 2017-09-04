package design.pattern.filter;

import java.util.List;

/**
 * Created by sky on 2017/9/1.
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return this.otherCriteria.meetCriteria(this.criteria.meetCriteria(persons));
    }
}
