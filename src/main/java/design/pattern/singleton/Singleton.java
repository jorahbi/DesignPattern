package design.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例
 */
public class Singleton implements Serializable{

    //private Singleton(){};

    //饿汉式
    //饿汉式测试，多线程并发是同一单例
    private static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }

    //懒汉式 多线程并发不是同一单例
    private static Singleton singleton1 = null;
    public static Singleton getInstance1(){
        if(Singleton.singleton1 == null){
            try {
                Thread.sleep(300);
                Singleton.singleton1 = new Singleton();
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
        return Singleton.singleton1;
    }

    //懒汉式线程安全 多线程并发是同一单例
    public static synchronized Singleton getInstance2(){
        if(Singleton.singleton1 == null){
            try {
                Thread.sleep(300);
                Singleton.singleton1 = new Singleton();
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
        return Singleton.singleton1;
    }

    //懒汉式线程安全 同步块 多线程并发不是同一单例

    public static Singleton getInstance3(){

        try {
            if(Singleton.singleton1 == null) {
                Thread.sleep(300);
                synchronized (Singleton.class) {
                    Singleton.singleton1 = new Singleton();
                }
            }
        }catch (InterruptedException e){
            e.getStackTrace();
        }

        return Singleton.singleton1;
    }

    //懒汉 双锁检查 线程安全 推荐
    private volatile static Singleton singleton2 = null;

    public static Singleton getInstance4(){
        try {
            if(Singleton.singleton2 == null) {
                Thread.sleep(300);
                synchronized (Singleton.class) {
                    if(Singleton.singleton2 == null) { //二次检查
                        Singleton.singleton2 = new Singleton();
                    }
                }
            }
        }catch (InterruptedException e){
            e.getStackTrace();
        }
        return Singleton.singleton2;
    }

    //内部类实现 序列化时不是同一单例
    private static class SingletonChildren{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance5(){
        return SingletonChildren.singleton;
    }

    //序列化添加此方法可以线程安全
    protected Object readResolve() throws ObjectStreamException{
        System.out.println("调用了 readResolve method");
        return SingletonChildren.singleton;
    }

    //静态块 线程安全
    private static Singleton singleton3 = null;
    static {
        Singleton.singleton3 = new Singleton();
    }
    public static Singleton getInstance6(){
        return Singleton.singleton3;
    }
}

