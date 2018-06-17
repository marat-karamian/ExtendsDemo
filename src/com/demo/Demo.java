package com.demo;

public class Demo {

    public static void main(String[] args) {

        int userChoice = 10;

        Parent p;

        if (userChoice == 1) {
            p = new ChildOne();
        } else if (userChoice == 2) {
            p = new ChildTwo();
        } else {
            p = new Parent();
        }

        p.print();

    }
}
