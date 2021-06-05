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

        System.out.println((sizeY - 1) / 8);

        for(int i = 0; i < sizeX; i++){
            map.put(new Coordinates(0, i), 'p');
        }

        int column = 1, row;
        for(int i = 0; i < ((sizeY - 1) / 8); i++){
            for(int count = 0; count < 7; column++, count++) {
                if(count == 3){
                    map.put(new Coordinates(column, (sizeX - 1)), 'w');
                } else {
                    map.put(new Coordinates(column, (sizeX - 1)), 'p');
                }
                for (row = (sizeX - 2); row > (sizeX - 9); row--) {
                    map.put(new Coordinates(column, row), 'h');
                }
                for(int countForHouses = row; countForHouses >= 0; countForHouses--) {
                    map.put(new Coordinates(column, countForHouses), 'p');
                }
            }
        }

        for(; column < sizeY; column++){
            for(int my_row = 0; my_row < sizeX; my_row++){
                map.put(new Coordinates(column, my_row), 'p');
            }
        }
    }
}
