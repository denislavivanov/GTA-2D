package com.elsys;

import org.lwjgl.system.CallbackI;

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

        SmallHouses smallHouses1 = new SmallHouses("Small Houses", map, 1);
        TowerBlock towerBlock1 = new TowerBlock("Tower", map, 1);
        Supermarket supermarket = new Supermarket("Billa", map);

        SmallHouses smallHouses2 = new SmallHouses("Small Houses2", map, 2);

        Skyscraper skyscraper = new Skyscraper("Skyscraper", map);

        SmallHouses smallHouses3 = new SmallHouses("Small Houses3", map, 3);
        TowerBlock towerBlock2 = new TowerBlock("Tower", map, 2);

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