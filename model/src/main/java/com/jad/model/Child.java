package com.jad.model;

import com.jad.model.behavior.Behavior;
import com.jad.model.behavior.BehaviorNothing;

import java.awt.*;

public class Child {

    private Point pos;
    private Behavior behavior = new BehaviorNothing();

    public void setForest(Forest forest) {
        this.forest = forest;
    }

    private Forest forest;

    public Point getPos(){
        return this.pos;
    }

    Child(Point pos){
        this.pos = pos;
    }

    public void setBehavior(Behavior behavior) {
        behavior.SetBehavior(this.behavior);
        this.behavior = behavior;
    }

    public Character[][] getSprite(){
        return this.behavior.getSprite();
    }
}
