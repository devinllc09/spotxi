package com.devin.spotxi;

public class CustomAdapter {

    private String teamA,teamB,time,place;

    public CustomAdapter(String teamA, String teamB, String time, String place) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.time = time;
        this.place = place;
    }
    public CustomAdapter() {

    }
    public String getTeamA() {return teamA;}
    public void setTeamA(String teamA) {this.teamA = teamA;}
    public String getTeamB() {return teamB;}
    public void setTeamB(String teamB) {this.teamB = teamB;}
    public String getTime() {return time;}
    public void setTime(String time) {this.time = time;}
    public String getPlace() {return place;}
    public void setPlace(String place) {this.place = place;}
}
