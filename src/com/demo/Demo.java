package com.demo;

import javax.swing.event.MenuEvent;

public class Demo {

    public static void main(String[] args) {
        Button b = new Button();

        MyEventProcessor eventProcessor = new MyEventProcessor();
        b.addHandler(eventProcessor);
        b.action();

        EventHandler eventProcessor2 = new MySecondEventProcessor();
        b.addHandler(eventProcessor2);
        b.action();
    }
}