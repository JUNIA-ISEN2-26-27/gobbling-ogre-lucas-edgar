package com.jad.model;

import java.util.Random;

public enum Tile {
    EMPTY(true, ' ', new Character[][]{
            {' ', ' ' ,' ', ' ' ,' ', ' '},
            {' ', ' ' ,' ', ' ' ,' ', ' '},
            {' ', ' ' ,' ', ' ' ,' ', ' '},
    }),
    CHENE(false, 'c', new Character[][]{
            {'a', 'a' ,'a', 'a' ,'a', 'a'},
            {'a', 'a' ,'a', 'a' ,'a', 'a'},
            {'a', 'a' ,'a', 'a' ,'a', 'a'},
    }),
    SAPIN(false, 's', new Character[][]{
            {'a', 'a' ,'a', 'b' ,'b', 'b'},
            {'a', 'a' ,'a', 'b' ,'b', 'b'},
            {'a', 'a' ,'a', 'b' ,'b', 'b'},
    }),
    ACACIA(false, 'a', new Character[][]{
        {'a', 'a' ,'a', 'c' ,'a', 'a'},
        {'a', 'a' ,'a', 'c' ,'a', 'a'},
        {'a', 'a' ,'a', 'c' ,'a', 'a'},
    });

    final Boolean passable;
    Character character;
    Tile(boolean b, Character character, Character[][] sprite) {
        this.passable = b;
        this.character = character;
        this.sprite = sprite;
    }
    Character[][] sprite;

    public static Tile randomTile(){
        Random random = new Random();
        int rand = random.nextInt(Tile.values().length-1);
        return Tile.values()[rand+1];
    }
}
