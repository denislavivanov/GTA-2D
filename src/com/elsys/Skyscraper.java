package com.elsys;

import java.util.TreeMap;

public class Skyscraper extends Building{

    public Skyscraper(String name, TreeMap<Coordinates, Character> map){
        super(name);
    }


    public void makeSkyscraper(TreeMap<Coordinates, Character> map) {
        int sizeX, sizeY, distance = 0;
        for(sizeX = 0; map.get(new Coordinates(0, sizeX)) != 'w'; sizeX++);
        for(sizeY = 0; map.get(new Coordinates(sizeY, 0)) != 'w'; sizeY++);
        sizeY += 9;
        sizeX += 9;

        for(; map.get(new Coordinates(sizeY, sizeX - 1)) != 'w'; distance++, sizeY++);
        System.out.printf("Distance: %d\n", distance);

        map.put(new Coordinates(sizeY, sizeX), '|');

    }
}
