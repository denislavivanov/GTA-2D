package com.elsys;

import java.util.Vector;

public class Player {
    String username;
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

    public Player(String username, Person type) {
        this.username = username;
        this.type = type;
    }
}