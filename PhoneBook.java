package ru.sidorenko.se.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class PhoneBook {

    private ArrayList<String> lastName = new ArrayList<>();
    private ArrayList<Integer> number = new ArrayList<>();


    void setNumber(String lastName, Integer number) {
        this.lastName.add(lastName);
        this.number.add(number);
    }

    void getNumber(String lastName) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        int n = 0;
        for (String s : this.lastName) {
            int a;
            if (s.equals(lastName)){
                a = this.number.get(n);
                listNumber.add(a);
            }
            n++;
        }
        System.out.println("Фамилия абонента: " + lastName);
        System.out.println("Список номеров абонента: " + listNumber);
    }
}
