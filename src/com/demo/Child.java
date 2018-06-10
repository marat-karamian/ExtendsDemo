package com.demo;

public class Child extends Parent {

    int data;

    public Child() {
        super(10);
        data = 1000;

    }

    public void testChild() {
        System.out.println("Child ");
        System.out.println(data);
        System.out.println(super.data);
    }
}
