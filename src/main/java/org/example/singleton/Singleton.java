package org.example.singleton;

public class Singleton {
    private static volatile Singleton instance; // prevents threads from accessing an incomplete construction of the instance
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance; // prevents the volatile variable from being accessed twice from the memory which is suboptimal
        if (result == null) { // applying double-checked locking idiom
            synchronized (Singleton.class) { // synchronizing so that 2 threads don't construct 2 different instances at the same time
                result = instance;
                if (result == null){
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
