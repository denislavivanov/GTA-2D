package com.elsys;

public class Park implements GameObject, CollisionFree{

    @Override
    public char[][] init(char[][] map) {
        return map;
    }
}
