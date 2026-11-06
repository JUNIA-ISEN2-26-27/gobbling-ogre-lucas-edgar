package com.jad.model;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public abstract class AbstractForest implements Forest{

    private final Dimension dimension;
    private Tile[][] trees;
    private Boolean wrapHorizontal;
    private Boolean wrapVertical;

    public AbstractForest(Dimension dimension, int density, Boolean wrapHorizontal, Boolean wrapVertical) {
        this.dimension = dimension;
        this.trees = new Tile[this.dimension.height][this.dimension.width];
        this.wrapHorizontal = wrapHorizontal;
        this.wrapVertical = wrapVertical;
        makeRandomTrees(density);
    }

    public Character getxy(int x, int y){
        if (wrapVertical && wrapHorizontal){
            while (y < 0){
                y = this.dimension.width+y;
            }
            while (x < 0){
                x = this.dimension.height+x;
            }
            return this.trees[y%dimension.height][x%dimension.width].character;
        }
        else if (wrapHorizontal){
            if ((y < 0) || (y >= this.dimension.height)) {
                return Tile.randomTile().character;
            }
            while (x < 0){
                x = this.dimension.height+x;
            }
            return this.trees[y][x%dimension.width].character;
        }
        else if (wrapVertical){
            if ((x < 0) || (x >= this.dimension.width)) {
                return Tile.randomTile().character;
            }
            while (y < 0){
                y = this.dimension.width+y;
            }
            return this.trees[y%dimension.height][x].character;
        }
        else{
            if ((x < 0) || (x >= this.dimension.width) || (y < 0) || (y >= this.dimension.height)) {
                return Tile.randomTile().character;
            }
            return this.trees[y][x].character;
        }
    }

    @Override
    public void makeRandomTrees(int density) {
        for (int i = 0; i < dimension.width; i++){
            for (int j = 0; j < dimension.height; j++){
                Random random = new Random();
                int rand = random.nextInt(density);
                if (rand != 0){
                    trees[j][i] = Tile.EMPTY;
                }
                else{
                    trees[j][i] = Tile.randomTile();
                }
            }
        }
    }

    @Override
    public int getHeight() {
        return this.dimension.height;
    }

    @Override
    public int getWidth() {
        return this.dimension.width;
    }

    public Boolean isPosXY(int x, int y){
        return trees[y][x].passable;
    }


}
