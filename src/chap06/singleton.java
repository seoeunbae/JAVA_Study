package chap06;

public class singleton {
    private static singleton Singleton = new singleton();

    private singleton() { }

    static singleton getInstance() {
        return Singleton;
    }

}


