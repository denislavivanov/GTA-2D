package com.elsys;

public abstract class Weapon implements Accessible{
    String name;
    int capacity;

    public Weapon(String name) {
        this.name = name;
    }
}