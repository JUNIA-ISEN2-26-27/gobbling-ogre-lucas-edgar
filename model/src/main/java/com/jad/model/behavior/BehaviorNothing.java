package com.jad.model.behavior;

public class BehaviorNothing implements Behavior{
    private final Character[][] sprite =  new Character[][]{
            {' ', ' ', ' ', '■', ' ', ' '},
            {' ', ' ', '╾', '▒', '╼', ' '},
            {' ', ' ', '┛', ' ', '┗', ' '}
    };

    @Override
    public Character[][] getSprite() {
        return sprite;
    }

    @Override
    public void move() {
    }

    @Override
    public void SetBehavior(Behavior behavior) {
    }
}
