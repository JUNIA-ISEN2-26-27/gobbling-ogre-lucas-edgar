package com.jad.model;

import java.awt.*;

public class Screen implements IScreen {
    Dimension dimension;
    Character[][][][] trees;
    Boolean wrapHorizontal;
    Boolean wrapVertical;

    public Screen(Dimension dimension, int density, Boolean wrapHorizontal, Boolean wrapVertical,
                  Character[][][][] trees) {
        this.dimension = dimension;
        this.trees = trees;
        this.wrapVertical = wrapVertical;
        this.wrapHorizontal = wrapHorizontal;
    }

    @Override
    public int getHeight() {
        return this.dimension.height;
    }

    @Override
    public int getWidth() {
        return this.dimension.width;
    }

    @Override
    public Character[][] getxy(int x, int y){
        if (wrapVertical && wrapHorizontal){
            while (y < 0){
                y = this.dimension.width+y;
            }
            while (x < 0){
                x = this.dimension.height+x;
            }
            return this.trees[y%dimension.height][x%dimension.width];
        }
        else if (wrapHorizontal){
            if ((y < 0) || (y >= this.dimension.height)) {
                return com.jad.model.Tile.randomTile().sprite;
            }
            while (x < 0){
                x = this.dimension.height+x;
            }
            System.out.println(this.dimension.width + " " + this.getWidth());
            return this.trees[y][x%dimension.width];
        }
        else if (wrapVertical){
            if ((x < 0) || (x >= this.dimension.width)) {
                return com.jad.model.Tile.randomTile().sprite;
            }
            while (y < 0){
                y = this.dimension.width+y;
            }
            return this.trees[y%dimension.height][x];
        }
        else{
            if ((x < 0) || (x >= this.dimension.width) || (y < 0) || (y >= this.dimension.height)) {
                return Tile.randomTile().sprite;
            }
            else{
            return this.trees[y][x];
            }
        }
    }

}
