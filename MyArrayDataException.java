package ru.sidorenko.se.lesson2;

public class MyArrayDataException extends MyArrayException {

    private int a;
    private int b;

    public MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void getMessageArray(){
        System.out.println("Не верные данные в ячейке: строка " + a +" , столбец " + b);
    }
}
