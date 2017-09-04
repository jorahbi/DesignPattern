package design.pattern.filter;

import java.util.List;

/**
 * 过滤器模式（条件）
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
