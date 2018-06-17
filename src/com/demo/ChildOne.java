package com.demo;

public class ChildOne extends Parent {

    @Override
    public void print() {
        System.out.println("Some usefull string: ");
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void test() {
        System.out.println("Static test Child");
    }

    @Override
    void abstr() {

    }

}
