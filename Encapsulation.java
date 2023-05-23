package org.example;

public class Student {
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    private  int rollNumber;
    private  String name;
    private boolean isAttended;
    public Student (int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public boolean isAttended() {
        return isAttended;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttended(boolean attended) {
        isAttended = attended;
    }

    public String getName() {
        return name;
    }

    public void setStudentAttendence(boolean flag) {
        if(!isAttended)
            isAttended = flag;
        System.out.println("teacher assigned attendence");
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public boolean getStudentAttendence() {
        System.out.println("Teacher accessed student attendence");
        return isAttended;
    }
}