package com.example.demo;

public class Singleton {

    // volatile will ensure object will remain singleton through any of the changes in the jvm.
    private static volatile Singleton instance = null;

    private Singleton() {
        // stop object being created through reflection.
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // synchronized method is a performance hit every time the method is called.
    public static Singleton getInstance() {
        // lazy loaded for performance startup speed.
        if (instance == null) {
            // Synchronize only the first time getInstance is called. Better performance.
            synchronized (Singleton.class) {
                // Only one thread can execute this block at a time so if one thread already created the object, the second thread will see the instance is not null and exit.
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
