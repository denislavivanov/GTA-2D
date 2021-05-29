package com.elsys;

import org.joml.Vector2f;

import java.util.ArrayList;

public abstract class Building {
    ArrayList<Vector2f> buildings;

    public Building(){
        buildings = new ArrayList<Vector2f>();
    }
}
