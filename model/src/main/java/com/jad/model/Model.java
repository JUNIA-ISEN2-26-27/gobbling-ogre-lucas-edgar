package com.jad.model;

import java.awt.*;
import java.util.Arrays;

public class Model implements IModel {

    Forest forest;
    private final int density = 5;
    private final int width = 10;
    private final int height = 10;
    private final int forestType = 3;
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public Model() {
        AbstractForestFactory factory = new AbstractForestFactory();
        this.forest = factory.createForest(forestType%4, width, height, density);
    }

    @Override
    public IScreen getScreen(Dimension dimension, int x, int y) {
        return new Screen(this.forest.getDimension(), this.density, this.forest.getWrapHorizontal(), this.forest.getWrapVertical(),this.forest.getx1y1x2y2(x ,y , (int)(x+ dimension.getWidth()), (int)(y+ dimension.getHeight())));
    }
}
