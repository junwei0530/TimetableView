package com.github.tlaabs.timetableview;

import java.io.Serializable;

public class Schedule implements Serializable {
    static final int MON = 1;
    static final int TUE = 2;
    static final int WED = 3;
    static final int THU = 4;
    static final int FRI = 5;
    static final int SAT = 6;
    static final int SUN = 7;

    String classTitle="";
    String classPlace="";
    String professorName="";
    String HourPay="";
    
    private int available = 1;
    private int day = 0;
    private Time startTime;
    private Time endTime;

    public Schedule() {
        this.startTime = new Time();
        this.endTime = new Time();
    }
    
    public int getAvailable(){
        return available;
    }
    
    public void setAvailable(int available){
        this.available = available;
    }
    
    public String getHourPay(){
        return HourPay;
    }
    
    public void setHourPay(String HourPay){
        this.HourPay = HourPay;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getClassTitle() {
        return classTitle;
    }
    
    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public String getClassPlace() {
        return classPlace;
    }

    public void setClassPlace(String classPlace) {
        this.classPlace = classPlace;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
