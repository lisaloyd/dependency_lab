package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Robot robot_one = new Robot();
        System.out.println(robot_one.name);
        robot_one.Attack();
    }
}
