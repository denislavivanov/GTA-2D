package com.elsys;

public class Car implements GameObject, Accessible{
    @Override
    public char[][] init(char[][] map) {
        return map;
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
