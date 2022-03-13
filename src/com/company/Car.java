package com.company;

public class Car {
    private int id;
    private String gosNomer;

    public Car(int id, String gosnomer) {
        this.id = id;
        this.gosNomer = gosnomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGosNomer() {
        return gosNomer;
    }

    public void setGosNomer(String gosNomer) {
        this.gosNomer = gosNomer;
    }

    @Override
    public String toString() {
        return "Id : " + id + "\nGos Nomer : " + gosNomer;
    }
}
