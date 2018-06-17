package com.demo;

public abstract class Parent {
    int data = 100;

    public void print() {
        System.out.println("Parent: " + data);
    }

    public static void test() {
        System.out.println("Static test");
    }

    abstract void abstr();
}
