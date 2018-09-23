package ru.sidorenko.se.lesson3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class MyAppTest {

    @Test
    public void test(){
        ArrayList<String> al = new ArrayList<String>();
        al.add("раз");
        al.add("два");
        al.add("три");
        al.add("три");
        al.add("три");
        al.add("раз");
        al.add("два");
        al.add("раз");
        al.add("два");
        al.add("раз");
        al.add("раз");
        al.add("раз");
        al.add("раз");
        al.add("раз");
        al.add("раз");
        al.add("четыре");
        al.add("раз");
        al.add("четыре");
        al.add("раз");
        al.add("раз");
        System.out.println(al);

        ArrayList<String> checkArray = new ArrayList<String>();
        for (String o : al){
            if (!checkArray.contains(o)){
                checkArray.add(o);
            }else{
                continue;
            }
            int n = 0;
            for(int i = 0; i<al.size(); i++){
                if (o.equals(al.get(i))) n++;
            }
            System.out.println(n);
        }
        System.out.println(checkArray);
        LinkedHashSet<String> newList = new LinkedHashSet<>(al);
        System.out.println(newList);
    }

    @Test
    public void getArray(){
        PhoneBook pb = new PhoneBook();
        pb.setNumber("Petrov", 1111111);
        pb.setNumber("Ivanov", 1234123);
        pb.setNumber("Petrov", 4345678);
        pb.setNumber("Petrov", 2222222);
        pb.setNumber("Petrov", 3333333);
        pb.getNumber("Petrov");
    }
}
