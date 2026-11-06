package com.jad.model;
import java.awt.*;

public abstract class AbstractForest implements Forest{

    private final Dimension dimension;
    private Tile[][] trees;
    private Boolean wrapHorizontal;
    private Boolean wrapVertical;

    public AbstractForest(Dimension dimension, Tile[][] trees, Boolean wrapHorizontal, Boolean wrapVertical) {
        this.dimension = dimension;
        this.trees = trees;
    }

    public Character getxy(int x, int y){
        if (wrapHorizontal){
            if ((y < 0) || (y >= this.dimension.height)) {
                return Tile.CHENE.character;
            }
            while (x < 0){
                x += dimension.width;
            }
            return this.trees[y][x%dimension.width].character;
        }
        else if (wrapVertical){
            if ((x < 0) || (x >= this.dimension.width)) {
                throw new IllegalArgumentException("Position (" + x + ") is out of range");
            }
            while (y < 0){
                y += dimension.width;
            }
            return this.trees[y%dimension.height][x].character;
        }
        else if (wrapVertical && wrapHorizontal){
            while (y < 0){
                y += dimension.width;
            }
            while (x < 0){
                x += dimension.width;
            }
            return this.trees[y%dimension.height][x%dimension.width].character;
        }
        else{
            if ((x < 0) || (x >= this.dimension.width) || (y < 0) || (y >= this.dimension.height)) {
                throw new IllegalArgumentException("Position (" + x + ", " + y + ") is out of range");
            }
            return this.trees[y][x].character;
        }
    }

    public Boolean isPosXY(int x, int y){
        return trees[y][x].passable;
    }

}
