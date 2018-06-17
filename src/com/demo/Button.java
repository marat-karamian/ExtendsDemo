package com.demo;

public class Button {
    EventHandler handler;
    ActionEventHandler acHandler;

    public void addClickHandler(EventHandler handler) {
        this.handler = handler;
    }

    public void addActionHadler(ActionEventHandler handler) {
        this.acHandler = handler;
    }

    public void action() {
        System.out.println("Button clicked");
        handler.onClick();
        acHandler.onAction();
    }
}