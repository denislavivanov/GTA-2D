package com.elsys;

import java.util.TreeMap;

public class TowerBlock extends Building implements Accessible{

    public TowerBlock(String name, TreeMap<Coordinates, Character> map){
        super(name);
        init(map);
    }


    @Override
    public void init(TreeMap<Coordinates, Character> map) {
        int sizeX, sizeY;
        for(sizeX = 0; map.get(new Coordinates(0, sizeX)) != 'w'; sizeX++);

        for(sizeY = 0; map.get(new Coordinates(sizeY, 0)) != 'w'; sizeY++);
        sizeX += 9;

        int row = 0, count2;
        for(int column = (sizeY - 1), count = 0; count < 7; column--, count++){
            //System.out.printf("SizeX: %d; Column: %d\n", sizeX, column);
            for(row = (sizeX + 1), count2 = 0; count2 < 7; row++, count2++){
                map.put(new Coordinates(column, row), 't');
            }
        }

        while(map.get(new Coordinates(0, (row + 1))) != 'w') {
            row++;
        }

        int my_row = 0;
        for(int column = (sizeY - 1), count = 0; count < 7; column--, count++){
            for(my_row = (row - 1), count2 = 0; count2 < 7; my_row--, count2++){
                map.put(new Coordinates(column, my_row), 't');
            }
        }

        for(int column = (sizeY - 8); column >= 0; column--){
            for(int row3 = sizeX; row3 <= row; row3++){
                map.put(new Coordinates(column, row3), 'p');
            }
        }

        for(int column = (sizeY - 1); map.get(new Coordinates(column, sizeX)) != 'p'; column--){
            map.put(new Coordinates(column, sizeX), 'p');
            for(int row4 = sizeX + 8; map.get(new Coordinates(column, row4)) != 't'; row4++){
                map.put(new Coordinates(column, row4), 'p');
            }

            map.put(new Coordinates(column, row), 'p');
        }
    }
}
