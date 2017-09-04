package design.pattern.builder;

/**
 * 建造者
 * 物品
 */
public interface Item {
    String name();
    Package packing();
    float price();
}
