package com.jad.model;

import com.jad.view.Tile;

import java.awt.*;

abstract class AbstractPixelMatrix {

    protected final Dimension dimension;
    protected final com.jad.model.Tile[][] tile;

    AbstractPixelMatrix(Dimension dimension, com.jad.model.Tile[][] tile) {
        this.dimension = dimension;
        this.tile = tile;
    }

    public int getHeight(){
        return this.dimension.height;
    }

    public int getWidth(){
        return this.dimension.width;
    }

    public Tile getPixelAt(Point position){
        return this.getTileAt(position.x, position.y);
    }

    private Tile getTileAt(int x, int y) {
        return null;
    }

    public com.jad.model.Tile getPixelAt(final int x, final int y){
        if ((x < 0) || (x >= this.dimension.width) || (y < 0) || (y >= this.dimension.height)) {
            throw new IllegalArgumentException("Position (" + x + ", " + y + ") is out of range");
        }
        return this.tile[y][x];
    }
}
