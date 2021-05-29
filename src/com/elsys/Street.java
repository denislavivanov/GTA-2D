package com.elsys;

import org.joml.Vector2f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Street {
    ArrayList<Vector2f> streetFrames;
    ArrayList<Vector2f> sideWalk;

    public ArrayList<Vector2f> getStreetFrames() {
        return streetFrames;
    }

    public ArrayList<Vector2f> getSideWalk() {
        return sideWalk;
    }

    public Street() {
        streetFrames = new ArrayList<Vector2f>();
        sideWalk = new ArrayList<Vector2f>();
        int area = this.getRand(1, 3);
        if(area == 1){
            this.makeStreet(1);
            this.makeStreet(3);
        } else{
            this.makeStreet(2);
            this.makeStreet(4);
        }
        this.printStreet();

    }

    public void makeStreet(int area){
        int x = -1, y = -1;
        if(area == 1){
            x = this.getRand(39, 58);
            y = this.getRand(39, 58);
        } else if(area == 2){
            x = this.getRand(7, 26);
            y = this.getRand(39, 58);
        } else if(area == 3){
            x = this.getRand(7, 26);
            y = this.getRand(7, 26);
        } else if(area == 4){
            x = this.getRand(39, 58);
            y = this.getRand(7, 26);
        }

        for(int i = 0; i <= 64; i++){
            this.streetFrames.add(new Vector2f(x, i));
            this.streetFrames.add(new Vector2f(i, y));
            for(int j = 1; j < 4; j++){
                this.streetFrames.add(new Vector2f(x + j, i));
                this.streetFrames.add(new Vector2f(x - j, i));
                this.streetFrames.add(new Vector2f(i, y + j));
                this.streetFrames.add(new Vector2f(i, y - j));
            }
            int flag1 = 0, flag2 = 0;
            for(Vector2f it: streetFrames){
                if(it.x == (x+4) && it.y == (i)){
                    flag1 = 1;
                }
                if(it.x == (i) && it.y == (y+4)){
                    flag2 = 1;
                }
            }
            if(flag1 == 0){
                this.sideWalk.add(new Vector2f(x + 4, i));
                this.sideWalk.add(new Vector2f(x - 4, i));
            }
            if(flag2 == 0){
                this.sideWalk.add(new Vector2f(i, y + 4));
                this.sideWalk.add(new Vector2f(i, y - 4));
            }
        }
        for(Vector2f it: streetFrames){
            Iterator<Vector2f> it2 = sideWalk.iterator();
            while(it2.hasNext()){
                Vector2f vector2f = it2.next();
                if(it.x == vector2f.x && it.y == vector2f.y){
                    it2.remove();
                }
            }
        }
    }

    public void printStreet(){
        for(int y = 64; y >= 0; y--){
            for(int x = 0; x <= 64; x++){
                int flag = 0;
                for(Vector2f it: streetFrames){
                    if(it.x == x && it.y == y){
                        System.out.printf("|");
                        flag = 1;
                        break;
                    }
                }
                for(Vector2f it: sideWalk){
                    if(it.x == x && it.y == y){
                        System.out.printf("=");
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    public int getRand(int low, int high) {
        Random random = new Random();
        return random.nextInt(high-low) + low;
    }
}
