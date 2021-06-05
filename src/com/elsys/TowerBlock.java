package com.elsys;

import java.util.TreeMap;

public class TowerBlock extends Building implements Accessible{

    public TowerBlock(String name, TreeMap<Coordinates, Character> map){
        super(name);
        init(map);
    }


    @Override
    public void init(TreeMap<Coordinates, Character> map) {
        /*int cordX, cordY, sizeX, sizeY;
        for(cordX = 0; map[64][cordX] != 'w'; cordX++);
        cordX += 9;
        for(sizeX = cordX; map[64][sizeX] != 'w'; sizeX++);
        sizeX = sizeX - cordX - 2;
        for(cordY = 64; map[cordY][0] != 'w'; cordY--);
        sizeY = 64 - cordY - 2;*/
        //System.out.println(cordY);
        //System.out.println(sizeX);

        //System.out.println(sizeY);

        //int sizeX, sizeY = 64 - cordY;
        /*for(){

        }*/

    }
}
