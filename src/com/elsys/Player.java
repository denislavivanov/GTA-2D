package com.elsys;

import java.util.Random;
import java.util.Vector;

/*public class Player implements GameObject {
    String username;

    @Override
    public void init(char[][] map) {
        this.current_position = getRandPosition(64);
        if(map[current_position.x][current_position.y] == ' ') {
            map[current_position.x][current_position.y] = '*';
        }
        return map;
    }

    enum Person {
        Man1,
        Man2,
        Man3,
        Woman1,
        Woman2,
        Woman3
    }
    Person type;
    Vector<Weapon> weapons;
    int speed;
    class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    Pair current_position;

    public Pair getRandPosition(int randomRange) {
        Random rand = new Random();
        return new Pair(rand.nextInt(randomRange), rand.nextInt(randomRange));
    }

    public Player(String username, Person type, char[][] map) {
        this.username = username;
        this.type = type;
        init(map);
    }

    char[][] move_forward(char[][] map) {
        if(map[current_position.x - 1][current_position.y] != 'w'
                || map[current_position.x - 1][current_position.y] != 'p'
                || map[current_position.x - 1][current_position.y] != 's') {       // trqbva purvo da napravim vsichki obekti s collision
            char tmp = map[current_position.x - 1][current_position.y];
            map[current_position.x - 1][current_position.y] = 'p';
            map[current_position.x][current_position.y] = tmp;
            this.current_position.x--;
        }

        return map;
    }
    char[][] move_backward(char[][] map) {
        if(map[current_position.x + 1][current_position.y] != 'w'
                || map[current_position.x + 1][current_position.y] != 'p'
                || map[current_position.x + 1][current_position.y] != 's') {
            char tmp = map[current_position.x + 1][current_position.y];
            map[current_position.x + 1][current_position.y] = 'p';
            map[current_position.x][current_position.y] = tmp;
            this.current_position.x++;
        }

        return map;
    }
    char[][] move_left(char[][] map) {
        if(map[current_position.x][current_position.y - 1] == 'w'
                || map[current_position.x][current_position.y - 1] == 's'
                || map[current_position.x][current_position.y - 1] == 'p') {
            char tmp = map[current_position.x][current_position.y - 1];
            map[current_position.x][current_position.y - 1] = 'p';
            map[current_position.x][current_position.y] = tmp;
            this.current_position.y--;
        }

        return map;
    }
    char[][] move_right(char[][] map) {
        if(map[current_position.x][current_position.y + 1] == 'w'
                || map[current_position.x][current_position.y + 1] == 's'
                || map[current_position.x][current_position.y + 1] == 'p') {
            char tmp = map[current_position.x][current_position.y + 1];
            map[current_position.x][current_position.y + 1] = 'p';
            map[current_position.x][current_position.y] = tmp;
            this.current_position.y++;
        }

        return map;
    }
}*/