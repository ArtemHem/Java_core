package ru.sidorenko.se.lesson1;

public class Course {

    private Team team;
    private int[] course = new int[7];

    void doIt(Team team){
        for(int i = 0; i<team.getPlayersCount(); i++){
            int n = 0;
            for (int j =0; j<course.length;j++){
                n = j + 1;
            }
            team.setCountCourse(i,n);
        }
    }
}
