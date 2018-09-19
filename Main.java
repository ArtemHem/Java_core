package ru.sidorenko.se.lesson2;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    static String[][] m1 = new String[4][4];

    static void setMassive(){
        for (int i = 0;i<m1.length;i++){
            for (int j=0;j<m1[i].length;j++){
                m1[i][j] = "1";
            }
        }
//        m1[1][1] = "g";
    }

    public static void main(String[] args) {

        setMassive();
        ru.sidorenko.se.lesson2.Test t1 = new ru.sidorenko.se.lesson2.Test();
        try {
            int x = t1.sumCountMass(m1);
            System.out.println("Сумма элементов массива = " + x);
//        }catch (MyArraySizeException e) {
//            e.getMessageArray();
//        }catch (MyArrayDataException e) {
//            e.getMessageArray();
        }catch (MyArrayException e) {
            e.getMessageArray();
        }
    }
}
