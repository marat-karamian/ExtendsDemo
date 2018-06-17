package com.demo;

public class MySecondEventProcessor implements EventHandler {

    @Override
    public void onClick() {
        System.out.println("Button clicked in my second event handler");
    }
}
