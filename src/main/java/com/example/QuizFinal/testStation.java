package com.example.QuizFinal;


public class testStation {
    private int id;
    private String name;
    private int lunchnum;

    public testStation() {
    }

    public testStation(int id, String name, int lunchnum) {
        this.id = id;
        this.name = name;
        this.lunchnum = lunchnum;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLunchnum() {
        return lunchnum;
    }

    @Override
    public String toString() {
        return "testStation{" + "id=" + id + ", name=" + name + ", lunchnum=" + lunchnum + '}';
    }
    
    
}
