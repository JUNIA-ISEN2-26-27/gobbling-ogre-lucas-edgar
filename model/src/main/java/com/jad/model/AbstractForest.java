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

    public Character[][] getxy(int x, int y){
        if (wrapVertical && wrapHorizontal){
            while (y < 0){
                y = this.dimension.width+y;
            }
            while (x < 0){
                x = this.dimension.height+x;
            }
            return this.trees[y%dimension.height][x%dimension.width].sprite;
        }
        else if (wrapHorizontal){
            if ((y < 0) || (y >= this.dimension.height)) {
                return Tile.randomTile().sprite;
            }
            while (x < 0){
                x = this.dimension.height+x;
            }
            return this.trees[y][x%dimension.width].sprite;
        }
        else if (wrapVertical){
            if ((x < 0) || (x >= this.dimension.width)) {
                return Tile.randomTile().sprite;
            }
            while (y < 0){
                y = this.dimension.width+y;
            }
            return this.trees[y%dimension.height][x].sprite;
        }
        else{
            if ((x < 0) || (x >= this.dimension.width) || (y < 0) || (y >= this.dimension.height)) {
                return Tile.randomTile().sprite;
            }
            return this.trees[y][x].sprite;
        }
    }

    @Override
    public Character[][][][] getx1y1x2y2(int x1, int y1, int x2, int y2){
        Character[][][][] screen = new Character[Math.abs(y2-y1)][Math.abs(x2-x1)][3][6];
        for (int i = 0; i < Math.abs(x2-x1); i++){
            for (int j = 0; j < Math.abs(y2-y1); j++){
                screen[j][i] = this.getxy(i+x1,j+y1);
            }
        }
        return screen;
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

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    public Boolean isPosXY(int x, int y){
        return trees[y][x].passable;
    }


    @Override
    public Boolean getWrapHorizontal() {
        return wrapHorizontal;
    }

    @Override
    public Boolean getWrapVertical() {
        return wrapVertical;
    }
}
