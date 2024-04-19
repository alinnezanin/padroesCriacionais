package singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("First");
        singleton = Singleton.getInstance(null);
        System.out.println(singleton.value);
        System.out.println(singleton.value);
    }

}
