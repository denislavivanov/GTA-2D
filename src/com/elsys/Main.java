package com.elsys;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main implements KeyListener {

    public static void main(String[] args) {
        Map map = new Map();
        Player player1 = new Player("Player1", Player.Person.Man1, map.map, map.originalMap);


        //player1.move_up(map.map, map.originalMap);
    }

    @Override
    public void keyTyped(KeyEvent е) {

    }

    @Override
    public void keyPressed(KeyEvent е) {

    }

    @Override
    public void keyReleased(KeyEvent е) {

    }
}
