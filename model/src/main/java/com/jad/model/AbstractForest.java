package com.jad.model;
import java.awt.*;
import java.util.Random;

public abstract class AbstractForest implements Forest{

    private final Dimension dimension;
    private Tile[][] trees;
    private Boolean wrapHorizontal;
    private Boolean wrapVertical;

    public AbstractForest(Dimension dimension, int density, Boolean wrapHorizontal, Boolean wrapVertical) {
        this.dimension = dimension;
        makeRandomTrees(density);
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

    @Override
    public void makeRandomTrees(int density) {
        for (int i = 0; i < dimension.width; i++){
            for (int j = 0; i < dimension.height; j++){
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

    public Boolean isPosXY(int x, int y){
        return trees[y][x].passable;
    }

}
