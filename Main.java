package ru.sidorenko.se.lesson1;

public class Main {

    public static void main(String[] args) {

        Team t1 = new Team("Team_1","Player1","Player2","Player3","Player4");
        t1.teamInfo();
        Course course = new Course();
        course.doIt(t1);
        t1.resultTeam();
    }
}
