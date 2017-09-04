package design.pattern.singleton;

/**
 * 单例枚举
 */
public enum EnumSingleton {
    singletonFactory;

    private Singleton singleton;

    private EnumSingleton(){
        this.singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return EnumSingleton.singletonFactory.singleton;
    }
}
