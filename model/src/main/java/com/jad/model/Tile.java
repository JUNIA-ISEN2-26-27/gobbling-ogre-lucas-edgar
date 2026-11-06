package com.jad.model;

import java.util.Random;

public enum Tile {
    EMPTY(true, ' '),
    CHENE(false, 'c');

    final Boolean passable;
    Character character;
    Tile(boolean b, Character character) {
        this.passable = b;
        this.character = character;
    }
    Character[][] sprite;

    public Tile randomTile(){
        Random random = new Random();
        int rand = random.nextInt(Tile.values().length);
        return Tile.values()[rand];
    }
}
