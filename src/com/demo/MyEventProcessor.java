package com.demo;

public class MyEventProcessor implements EventHandler, ActionEventHandler {

    @Override
    public void onClick() {
        System.out.println("Button clicked in my event handler");
    }

    @Override
    public void onAction() {
        System.out.println("Button action in my event handler");
    }
}
