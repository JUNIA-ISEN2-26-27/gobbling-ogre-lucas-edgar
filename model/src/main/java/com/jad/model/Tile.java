package com.jad.model;

import java.util.Random;

public enum Tile {
    EMPTY(true, ' '),
    CHENE(false, 'c'),
    ACACIA(false, 'a');

    final Boolean passable;
    Character character;
    Tile(boolean b, Character character) {
        this.passable = b;
        this.character = character;
    }
    Character[][] sprite;

    public static Tile randomTile(){
        Random random = new Random();
        int rand = random.nextInt(Tile.values().length-1);
        return Tile.values()[rand+1];
    }
}
