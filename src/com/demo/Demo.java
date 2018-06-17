package com.demo;

public class Demo {

    public static void main(String[] args) {
        Button b = new Button();

        b.addClickHandler(new MyEventProcessor());
        b.addActionHadler(new MyEventProcessor());
        b.action();
    }
}