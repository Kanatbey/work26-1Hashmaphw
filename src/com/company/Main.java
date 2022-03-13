package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car, Information> transport = new HashMap<>();
        transport.put(new Car(400, "01 KG197AKA"),
                new Information(2011, "Range Rover", 30000, "black"));
        transport.put(new Car(405, "08 KG923AJC"),
                new Information(2017, "Hyundai Elentra VI", 18500, "silver"));
        transport.put(new Car(545, "03 KG000AAA"),
                new Information(2021, "Rolls Royce Phantom", 1850000, "absolute black"));
        transport.put(new Car(403, "03 KG777AAA"),
                new Information(2021, "Mercedes Maybach", 185000, "red and black"));
        transport.put(new Car(408, "01 KG999KK"),
                new Information(2017, "Tesla Model 3", 55000, "white"));

        for(Map.Entry a: transport.entrySet()){
            System.out.println(a.getKey()+"  "+a.getValue()+"\n");
        }

    }
}
