package com.demo;

public class Demo {

    public static void main(String[] args) {
        Button b = new Button();

        b.addClickHandler(new EventHandler() {
            @Override
            public void onClick() {
                System.out.println("Anon click");
            }
        });


        b.addActionHadler(new MyEventProcessor());
        b.action();
    }
}