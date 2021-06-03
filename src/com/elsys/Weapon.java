package com.elsys;

public abstract class Weapon implements CollisionFree{
    String name;
    int capacity;

    public Weapon(String name) {
        this.name = name;
    }
}