
import design.pattern.singleton.EnumSingleton;

public class SingletonTest extends Thread {

    @Override
    public void run(){
        //System.out.println(Singleton.getInstance6().hashCode());
        //enum 单例
        System.out.println(EnumSingleton.getInstance().hashCode());
    }
    //饿汉式测试，多线程并发是同一单例
    public static void main(String[] args){
        SingletonTest[] t1 = new SingletonTest[10];
        for (int i = 0; i < t1.length; i++){
            t1[i] = new SingletonTest();
        }

        for (int i = 0; i < t1.length; i++){
            t1[i].start();
        }
    }

/*
    //静态内部类序列化测试
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance5();
        File file = new File("test.txt");
        //write
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton);
            System.out.println("serialize " + singleton.hashCode());
            fos.close();
            oos.close();
        }catch (FileNotFoundException e){
            System.out.println("file not found exception" + e.getStackTrace());
        }catch (IOException e){
            System.out.println("io exception" + e.getStackTrace());
        }

        //read
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Singleton singleton1 = (Singleton) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("unSerialize " + singleton1.hashCode());
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }catch (IOException e){
            e.getStackTrace();
        }catch (ClassNotFoundException e){
            e.getStackTrace();
        }
    }*/
}
