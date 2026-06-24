package singleton_pattern;

public class Singleton {

    private static Singleton instance;

   
    private Singleton() {
        System.out.println("Singleton Object Created");
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Hello Singleton");
    }
    public static void run()
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.display();

        System.out.println(s1 == s2);
    }
}

