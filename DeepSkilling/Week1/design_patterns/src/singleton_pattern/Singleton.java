package singleton_pattern;

public class Singleton {

    public static void run() {
        Logger s1 = Logger.getInstance();
        Logger s2 = Logger.getInstance();

        s1.log("First message ");
        s2.log("Second message ");

        System.out.println("Same instance? " + (s1 == s2));
    }
}

