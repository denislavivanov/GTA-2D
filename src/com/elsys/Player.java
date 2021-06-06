package com.elsys;

import com.sun.source.tree.Tree;

import java.util.Random;
import java.util.TreeMap;
import java.util.Vector;

public class Player {
    String username;

    public enum Person {
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



    public Player(String username, Person type, TreeMap<Coordinates, Character> map, TreeMap<Coordinates, Character> originalMap) {
        this.username = username;
        this.type = type;
        create(map);
    }

    public void create(TreeMap<Coordinates, Character> map) {
        this.current_position = getRandPosition(64);
        while(map.get(new Coordinates(this.current_position.y, this.current_position.x)) != 'p' && map.get(new Coordinates(this.current_position.y, this.current_position.x)) != 'w'){
            this.current_position = getRandPosition(64);
        }
        map.put(new Coordinates(this.current_position.y, this.current_position.x), '*');
    }

    public Pair getRandPosition(int randomRange) {
        Random rand = new Random();
        return new Pair(rand.nextInt(randomRange), rand.nextInt(randomRange));
    }

    public void move_up(TreeMap<Coordinates, Character> map, TreeMap<Coordinates, Character> originalMap) {
        if(map.get(new Coordinates(current_position.y - 1, current_position.x)) == 'w'
                || map.get(new Coordinates(current_position.y - 1, current_position.x)) == 'p'
                || map.get(new Coordinates(current_position.y - 1, current_position.x)) == 's'
                || map.get(new Coordinates(current_position.y - 1, current_position.x)) == '1'
                || map.get(new Coordinates(current_position.y - 1, current_position.x)) == '2'
                || map.get(new Coordinates(current_position.y - 1, current_position.x)) == '3'
                || map.get(new Coordinates(current_position.y - 1, current_position.x)) == '4') {       // trqbva purvo da napravim vsichki obekti s collision

            if(map.get(new Coordinates(current_position.y - 1, current_position.x)) == '1'){
                weapons.add(new Knife());
                originalMap.put(new Coordinates(current_position.y - 1, current_position.x), 'p');
            } else if(map.get(new Coordinates(current_position.y - 1, current_position.x)) == '2'){
                weapons.add(new Pistol());
                originalMap.put(new Coordinates(current_position.y - 1, current_position.x), 'p');
            } else if(map.get(new Coordinates(current_position.y - 1, current_position.x)) == '3'){
                weapons.add(new AK47());
                originalMap.put(new Coordinates(current_position.y - 1, current_position.x), 'p');
            } else if(map.get(new Coordinates(current_position.y - 1, current_position.x)) == '4'){
                weapons.add(new RocketLauncher());
                originalMap.put(new Coordinates(current_position.y - 1, current_position.x), 'p');
            }

            map.put(new Coordinates(current_position.y - 1, current_position.x), '*');
            map.put(new Coordinates(current_position.y, current_position.x), originalMap.get(new Coordinates(current_position.y, current_position.x)));
            this.current_position.y--;
        }


    }
    public void move_down(TreeMap<Coordinates, Character> map, TreeMap<Coordinates, Character> originalMap) {
        if(map.get(new Coordinates(current_position.y + 1, current_position.x)) == 'w'
                || map.get(new Coordinates(current_position.y + 1, current_position.x)) == 'p'
                || map.get(new Coordinates(current_position.y + 1, current_position.x)) == 's'
                || map.get(new Coordinates(current_position.y + 1, current_position.x)) == '1'
                || map.get(new Coordinates(current_position.y + 1, current_position.x)) == '2'
                || map.get(new Coordinates(current_position.y + 1, current_position.x)) == '3'
                || map.get(new Coordinates(current_position.y + 1, current_position.x)) == '4') {       // trqbva purvo da napravim vsichki obekti s collision

            if(map.get(new Coordinates(current_position.y + 1, current_position.x)) == '1'){
                weapons.add(new Knife());
                originalMap.put(new Coordinates(current_position.y + 1, current_position.x), 'p');
            } else if(map.get(new Coordinates(current_position.y + 1, current_position.x)) == '2'){
                weapons.add(new Pistol());
                originalMap.put(new Coordinates(current_position.y + 1, current_position.x), 'p');
            } else if(map.get(new Coordinates(current_position.y + 1, current_position.x)) == '3'){
                weapons.add(new AK47());
                originalMap.put(new Coordinates(current_position.y + 1, current_position.x), 'p');
            } else if(map.get(new Coordinates(current_position.y + 1, current_position.x)) == '4'){
                weapons.add(new RocketLauncher());
                originalMap.put(new Coordinates(current_position.y + 1, current_position.x), 'p');
            }

            map.put(new Coordinates(current_position.y + 1, current_position.x), '*');
            map.put(new Coordinates(current_position.y, current_position.x), originalMap.get(new Coordinates(current_position.y, current_position.x)));
            this.current_position.y++;
        }

    }
    public void move_left(TreeMap<Coordinates, Character> map, TreeMap<Coordinates, Character> originalMap) {
        if(map.get(new Coordinates(current_position.y, current_position.x - 1)) == 'w'
                || map.get(new Coordinates(current_position.y, current_position.x - 1)) == 'p'
                || map.get(new Coordinates(current_position.y, current_position.x - 1)) == 's'
                || map.get(new Coordinates(current_position.y, current_position.x - 1)) == '1'
                || map.get(new Coordinates(current_position.y, current_position.x - 1)) == '2'
                || map.get(new Coordinates(current_position.y, current_position.x - 1)) == '3'
                || map.get(new Coordinates(current_position.y, current_position.x - 1)) == '4') {       // trqbva purvo da napravim vsichki obekti s collision

            if(map.get(new Coordinates(current_position.y, current_position.x - 1)) == '1'){
                weapons.add(new Knife());
                originalMap.put(new Coordinates(current_position.y, current_position.x - 1), 'p');
            } else if(map.get(new Coordinates(current_position.y, current_position.x - 1)) == '2'){
                weapons.add(new Pistol());
                originalMap.put(new Coordinates(current_position.y, current_position.x - 1), 'p');
            } else if(map.get(new Coordinates(current_position.y, current_position.x - 1)) == '3'){
                weapons.add(new AK47());
                originalMap.put(new Coordinates(current_position.y, current_position.x - 1), 'p');
            } else if(map.get(new Coordinates(current_position.y, current_position.x - 1)) == '4'){
                weapons.add(new RocketLauncher());
                originalMap.put(new Coordinates(current_position.y, current_position.x - 1), 'p');
            }

            map.put(new Coordinates(current_position.y, current_position.x - 1), '*');
            map.put(new Coordinates(current_position.y, current_position.x), originalMap.get(new Coordinates(current_position.y, current_position.x)));
            this.current_position.x--;
        }
    }
    public void move_right(TreeMap<Coordinates, Character> map, TreeMap<Coordinates, Character> originalMap) {
        if(map.get(new Coordinates(current_position.y, current_position.x + 1)) == 'w'
                || map.get(new Coordinates(current_position.y, current_position.x + 1)) == 'p'
                || map.get(new Coordinates(current_position.y, current_position.x + 1)) == 's'
                || map.get(new Coordinates(current_position.y, current_position.x + 1)) == '1'
                || map.get(new Coordinates(current_position.y, current_position.x + 1)) == '2'
                || map.get(new Coordinates(current_position.y, current_position.x + 1)) == '3'
                || map.get(new Coordinates(current_position.y, current_position.x + 1)) == '4') {       // trqbva purvo da napravim vsichki obekti s collision

            if(map.get(new Coordinates(current_position.y, current_position.x + 1)) == '1'){
                weapons.add(new Knife());
                originalMap.put(new Coordinates(current_position.y, current_position.x + 1), 'p');
            } else if(map.get(new Coordinates(current_position.y, current_position.x + 1)) == '2'){
                weapons.add(new Pistol());
                originalMap.put(new Coordinates(current_position.y, current_position.x + 1), 'p');
            } else if(map.get(new Coordinates(current_position.y, current_position.x + 1)) == '3'){
                weapons.add(new AK47());
                originalMap.put(new Coordinates(current_position.y, current_position.x + 1), 'p');
            } else if(map.get(new Coordinates(current_position.y, current_position.x + 1)) == '4'){
                weapons.add(new RocketLauncher());
                originalMap.put(new Coordinates(current_position.y, current_position.x + 1), 'p');
            }

            map.put(new Coordinates(current_position.y, current_position.x + 1), '*');
            map.put(new Coordinates(current_position.y, current_position.x), originalMap.get(new Coordinates(current_position.y, current_position.x)));
            this.current_position.x++;
        }
    }
}