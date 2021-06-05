package com.elsys;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class SmallHouses extends Building {
    public SmallHouses(String name, TreeMap<Coordinates, Character> map){
        super(name);
        init(map);
    }

    @Override
    public void init(TreeMap<Coordinates, Character> map) {
        int sizeX, sizeY;
        for(sizeX = 0; map.get(new Coordinates(0, sizeX)) != 'w'; sizeX++);

        for(sizeY = 0; map.get(new Coordinates(sizeY, 0)) != 'w'; sizeY++);

        System.out.printf("SizeX: %d; SizeY: %d;\n", sizeX, sizeY);

    }
}
