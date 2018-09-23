package ru.sidorenko.se.lesson3;

import java.util.*;

public class MyApp {

    public static void main(String[] args) {
        FirstEx ex1 = new FirstEx();
        ex1.run();
        System.out.println();
        PhoneBook pb = new PhoneBook();
        pb.setNumber("Petrov", 1111111);
        pb.setNumber("Ivanov", 1234123);
        pb.setNumber("Petrov", 4345678);
        pb.setNumber("Petrov", 2222222);
        pb.setNumber("Petrov", 3333333);
        pb.getNumber("Petrov");
    }
}
