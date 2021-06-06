package com.elsys;

import java.util.TreeMap;

public class RocketLauncher extends Weapon{

    public RocketLauncher(TreeMap<Coordinates, Character> map){
        super("RocketLauncher", 16);
        this.spawnWeapon(map, '4');
    }
    public RocketLauncher(){
        super("RocketLauncher", 16);
    }
}
