package com.elsys;

import java.util.Random;
import java.util.TreeMap;


public class Map {
    TreeMap<Coordinates, Character> originalMap;
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
        Mall mall = new Mall("Mall", map);

        SmallHouses smallHouses3 = new SmallHouses("Small Houses3", map, 3);
        TowerBlock towerBlock2 = new TowerBlock("Tower", map, 2);
        ClothingStore clothingStore = new ClothingStore("ClothingStore", map);

        originalMap = map;
        //this.printOnlyMap(map);

        Player player1 = new Player("Player1", Player.Person.Man1, map, originalMap);

        this.printMap(map, player1);
    }

    public int getRand(int randomRange) {
        Random rand = new Random();
        return rand.nextInt(randomRange);
    }

    public void printOnlyMap(TreeMap<Coordinates, Character> map){
        for(int column = 0; column < 64; column++){
            for(int row = 0; row < 64; row++){
                System.out.printf("%c", map.get(new Coordinates(column, row)));
            }
            System.out.printf("\n");
        }
    }

    public void printMap(TreeMap<Coordinates, Character> map, Player player){
        int column = player.current_position.y - 5;
        int row = player.current_position.x - 5;
        int printableX = 11, printableY = 11;

        for(int count = 0; count < printableY; count++, column++){

            for(int count2 = 0, my_row = row; count2 < printableX; count2++, my_row++){
                if(map.get(new Coordinates(column, my_row)) == null){
                    System.out.printf("#");
                } else{
                    System.out.printf("%c", map.get(new Coordinates(column, my_row)));
                }
            }
            System.out.printf("\n");
        }
    }

}