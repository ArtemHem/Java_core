package ru.sidorenko.se.lesson3;

import java.util.ArrayList;
import java.util.TreeSet;

public class FirstEx {

    private ArrayList arrayList = createArray();

    private ArrayList createArray() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("три");
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
        return al;
    }

    private void printStringAmt(ArrayList arrayList, Object o){
        int n = 0;
        for (Object b : arrayList) {
            if(b.equals(o)) n++;
        }
        if (n > 1 && n < 5) {
            System.out.println("Слово " + "'" + o + "'" + " повторяется в массиве " + n + " разa.");
        } else {
            System.out.println("Слово " + "'" + o + "'" + " повторяется в массиве " + n + " раз.");
        }
    }

    void run() {
        ArrayList<String> checkArray = new ArrayList<String>();
        System.out.println("Массив: " + arrayList);
        System.out.println("Список уникальных слов :" + new TreeSet<String>(arrayList));
        System.out.println();
        for (Object o : arrayList) {
            String a = (String) o;
            if (!checkArray.contains(a)) {
                checkArray.add(a);
            } else {
                continue;
            }
            printStringAmt(arrayList,o);
        }
    }
}
