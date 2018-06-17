package com.demo;

public class Button {
    EventHandler handler;

    public void addHandler(EventHandler handler) {
        this.handler = handler;
    }

    public void action() {
        System.out.println("Button clicked");
        handler.onClick();
    }
}
