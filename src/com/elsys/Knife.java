package com.elsys;

import java.util.TreeMap;

public class Knife extends Weapon{

    public Knife(TreeMap<Coordinates, Character> map){
        super("Knife", 256);
        this.spawnWeapon(map, '1');
    }
}
