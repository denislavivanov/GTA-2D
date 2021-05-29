package com.elsys;

import java.util.Random;

import org.joml.Vector2f;

public class Map{
    Street streets;

    public Map() {
        streets = new Street();

    }

    public int getRand(int randomRange) {
        Random rand = new Random();
        return rand.nextInt(randomRange);
    }

    public void printMap(){

    }

}