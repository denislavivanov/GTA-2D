package com.elsys;

import jdk.nashorn.api.tree.Tree;

import java.awt.*;
import java.util.TreeMap;

public class Main extends Canvas {

    public static void main(String[] args) {
        Map map = new Map();

        Player player1 = new Player("Player1", Player.Person.Man1, map.map, map.originalMap);
        map.printMap(map.originalMap, player1);

    }

}
