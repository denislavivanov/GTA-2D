package com.elsys;

import java.util.Random;
import java.util.TreeMap;


public class Map {
    //char[][] map;
    TreeMap<Coordinates, Character> map;

    public Map() {
        map = new TreeMap<Coordinates, Character>();

        for (int i = 0; i < 64; i++) {
            for(int j = 0; j < 64; j++) {
                map.put(new Coordinates(i, j), ' ');
            }
        }
        Street streets = new Street(map);

        SmallHouses smallHouses = new SmallHouses("Small Houses", map);
        TowerBlock towerBlock = new TowerBlock("Tower", map);
        Supermarket supermarket = new Supermarket("Billa", map);

        this.printMap();
    }

    public int getRand(int randomRange) {
        Random rand = new Random();
        return rand.nextInt(randomRange);
    }

    public void printMap(){
        for(int y = 0; y < 64; y++){
            for(int x = 0; x < 64; x++){
                System.out.printf("%c", map.get(new Coordinates(y, x)));

            }
            System.out.printf("\n");
        }
    }

}