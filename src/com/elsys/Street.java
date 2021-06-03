package com.elsys;

import java.util.Random;

public class Street implements CollisionFree{

    public Street(char[][] map) {
        int area = this.getRand(1, 3);
        if(area == 1){
            this.makeStreet(map, 1);
            this.makeStreet(map, 3);
        } else{
            this.makeStreet(map, 2);
            this.makeStreet(map, 4);
        }
        //this.printStreet();

    }

    public void test(char[][] map){
        map[32][32] = '+';

    }

    public void makeStreet(char[][] map, int area){
        int x = -1, y = -1;
        if(area == 1){
            x = this.getRand(44, 52);
            y = this.getRand(12, 20);
        } else if(area == 2){
            x = this.getRand(12, 20);
            y = this.getRand(12, 20);
        } else if(area == 3){
            x = this.getRand(12, 20);
            y = this.getRand(44, 52);
        } else if(area == 4){
            x = this.getRand(44, 52);
            y = this.getRand(44, 52);
        }
        //System.out.printf("X: %d; Y: %d;\n", x, y);
        for(int i = 0; i <= 64; i++){
            map[i][x] = 's';
            map[y][i] = 's';
            for(int j = 1; j < 4; j++){
                map[i][x + j] = 's';
                map[i][x - j] = 's';
                map[y + j][i] = 's';
                map[y - j][i] = 's';
            }
            if(map[i][x + 4] != 's'){
                map[i][x + 4] = 'w';
            }
            if(map[i][x - 4] != 's'){
                map[i][x - 4] = 'w';
            }
            if(map[y + 4][i] != 's'){
                map[y + 4][i] = 'w';
            }
            if(map[y - 4][i] != 's'){
                map[y - 4][i] = 'w';
            }
        }
    }

    public void printStreet(char[][] map){
        for(int y = 64; y >= 0; y--){
            for(int x = 0; x <= 64; x++){
                int flag = 0;
                System.out.printf("%c", map[x][y]);

            }
            System.out.printf("\n");
        }
    }

    public int getRand(int low, int high) {
        Random random = new Random();
        return random.nextInt(high-low) + low;
    }
}
