package ru.sidorenko.se.lesson2;

public class Test {

    int sumCountMass(String[][] mass) throws MyArrayException{

        int a = mass.length;
        int b = mass[0].length;
        int summ = 0;
        if((a != 4 || b != 4)) throw new MyArraySizeException();
        for (int i = 0; i<mass.length; i++){
            for (int j =0;j<mass[i].length;j++){
                int n = 0;
                try {
                    n = Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
                summ += n;
            }
        }
        return summ;
    }
}
