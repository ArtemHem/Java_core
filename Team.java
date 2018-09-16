package ru.sidorenko.se.lesson1;

public class Team {

    private String nameTeam;
    private Course course;

    private String[] players = new String[4];
    private int[] countCourse = new int[4];

    public Team(String nameTeam, String p1, String p2, String p3, String p4) {
        this.nameTeam = nameTeam;
        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
        players[3] = p4;
    }

    public int getPlayersCount() {
        return players.length;
    }

    void teamInfo() {
        System.out.println(nameTeam + ":");
        for (int i = 0; i < players.length; i++) {
            int n = i + 1;
            System.out.print("Участник " + n + ": " + players[i] + "; ");
        }
        System.out.println();
        System.out.println();
    }

    void resultTeam() {
        for (int i = 0; i < players.length; i++) {
            System.out.println(nameTeam + "." + players[i] + " прошел " + countCourse[i] + " препятствий");
        }
    }

    void setCountCourse(int player, int result) {
        countCourse[player] = result;
    }
}
