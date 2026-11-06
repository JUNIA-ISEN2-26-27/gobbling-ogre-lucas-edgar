package com.jad.model;

import java.awt.*;

public class AbstractForestFactory implements ForestFactory{
    private String factoryName = "";
    private Dimension dimension = null;
    private Tile[][] trees;
    private Boolean wrapHorizontal;
    private Boolean wrapVertical;

    protected AbstractForestFactory() {
        this.factoryName = factoryName;
        this.dimension = dimension;
        this.wrapHorizontal = wrapHorizontal;
        this.wrapVertical = wrapVertical;
    }

    @Override
    public Forest make() {
        return this.make();
    }
}
