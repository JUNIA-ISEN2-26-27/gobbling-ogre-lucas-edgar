package com.jad.model;

import java.awt.*;
import java.util.List;

public class AbstractForestFactory implements ForestFactory{
    private final String factoryName;
    private final Dimension dimension;
    private Tile[][] trees;
    private Boolean wrapHorizontal;
    private Boolean wrapVertical;

    protected AbstractForestFactory(String forestNameMade, String factoryName, Dimension dimension, Boolean wrapHorizontal, Boolean wrapVertical) {
        this.factoryName = factoryName;
        this.dimension = dimension;
        this.wrapHorizontal = wrapHorizontal;
        this.wrapVertical = wrapVertical;
    }

    @Override
    public Forest make(String forestName) {
        return this.make();
    }
}
