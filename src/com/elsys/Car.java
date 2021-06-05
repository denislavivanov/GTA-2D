package com.elsys;

import java.util.TreeMap;

public class Car implements GameObject, Accessible{
    @Override
    public void init(TreeMap<Coordinates, Character> map) {

    }

    public enum COLOR{
        blue,
        red,
        white,
        yellow
    }
    String brand;
    COLOR color;
    int speed;

    public Car(String brand, COLOR color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
}
