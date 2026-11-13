package com.jad.model;

import java.util.Random;

public enum Tile {
    EMPTY(true, ' ', new Character[][]{
            {' ', ' ' ,' ', ' ' ,' ', ' '},
            {' ', ' ' ,' ', ' ' ,' ', ' '},
            {' ', ' ' ,' ', ' ' ,' ', ' '},
    }),
    CHENE(false, 'c', new Character[][]{
            {' ', '╭', '─', '─', '╮', ' '},
            {'╭', '╯', ' ', ' ', '╰', '╮'},
            {'╰', '─', '╮', '╭', '─', '╯'}
    }),
    SAPIN(false, 's', new Character[][]{
            {' ', ' ', '╱', '╲', ' ', ' '},
            {' ', '╱', '╱', '╲', '╲', ' '},
            {'╱', '╱', '╮', '╭', '╲', '╲'}
    }),
    ACACIA(false, 'a', new Character[][]{
            {'╭', '─', '─', '─', '─', '╮'},
            {'│', ' ', ' ', ' ', ' ', '│'},
            {'╰', '╯', '╮', '╭', '╰', '╯'}
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
