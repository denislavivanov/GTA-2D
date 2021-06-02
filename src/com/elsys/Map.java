package com.elsys;

import java.util.Arrays;
import java.util.Random;


public class Map{
    char[][] map;

    public Map() {
        map = new char[65][65];
        for (char[] e : map) {
            Arrays.fill(e, ' ');
        }
        Street streets = new Street(map);
        TowerBlock towerBlock = new TowerBlock("House", map);
        this.printMap();
    }

    public int getRand(int randomRange) {
        Random rand = new Random();
        return rand.nextInt(randomRange);
    }

    public void printMap(){
        for(int y = 0; y <= 64; y++){
            for(int x = 0; x <= 64; x++){
                System.out.printf("%c", map[y][x]);

            }
            System.out.printf("\n");
        }
    }

}