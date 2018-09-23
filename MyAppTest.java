package ru.sidorenko.se.lesson3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class MyAppTest {

    public static void main(String[] args) {
//        ArrayList<String> a1 = new ArrayList<String>();
//        a1.add("A");
//        a1.add("B");
//        a1.add("C");
//        a1.add("D");
//        a1.add("E");
//        a1.add(1,"A0");
//        System.out.println(a1);
//        a1.remove("D");
//        a1.remove(0);
//        System.out.println(a1);
//        int a = a1.size();
//        System.out.println(a);

//        ArrayList<Integer> a = new ArrayList<Integer>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        Integer b[] = new Integer[a.size()];
//        a.toArray(b);
//        System.out.println(b);

//        LinkedList<String> w = new LinkedList<String>();
//        w.add("F");
//        w.add("B");
//        w.add("D");
//        w.add("E");
//        w.add("C");
//        w.addLast("Z");
//        w.addFirst("A");
//        w.add(1,"A2");
//        System.out.println("1. LinkedList w: " + w);
//        w.remove("F");
//        w.remove(2);
//        System.out.println("2. LinkedList w: " + w);
//        w.removeFirst();
//        w.removeLast();
//        System.out.println("3. LinkedList w: " + w);
//        String val = w.get(2);
//        w.set(2, val + " изменено");
//        System.out.println("4. LinkedList w: " + w);

//        LinkedHashSet<String> hs = new LinkedHashSet<String>();
//        hs.add("Бета");
//        hs.add("Альфа");
//        hs.add("Эта");
//        hs.add("Гамма");
//        hs.add("Эпсилон");
//        hs.add("Омега");
//        System.out.println(hs);

//        TreeSet<String> ts = new TreeSet<String>();
//        ts.add("C");
//        ts.add("A");
//        ts.add("B");
//        ts.add("E");
//        ts.add("F");
//        ts.add("D");
//        System.out.println(ts);

//        HashMap<String,String> hm = new HashMap<>();
//        hm.put("Russia","Moscow");
//        hm.put("France","Paris");
//        hm.put("Germany", "Berlin");
//        hm.put("Norway","Oslo");
//        Set<Map.Entry<String,String>> set = hm.entrySet();
//        for (Map.Entry<String,String> o : set){
//            System.out.print(o.getKey() + ": ");
//            System.out.println(o.getValue());
//        }
//        hm.put("Germany","Berlin2");
//        System.out.println("New Germany Entry: " + hm.get("Germany"));


    }

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
