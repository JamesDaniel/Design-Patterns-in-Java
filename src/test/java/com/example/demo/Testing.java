package com.example.demo;

import org.junit.jupiter.api.Test;

public class Testing {

    @Test
    public void singleton() {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void builder() {
        BuilderExample a = new BuilderExample.Builder()
                .one("one")
                .two("two")
                .three("three")
                .build();
        System.out.println(a.getOne());
    }
}
