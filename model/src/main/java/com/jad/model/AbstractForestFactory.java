package com.jad.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AbstractForestFactory implements ForestFactory{

    private final HashMap<Integer, ForestFactory> factories;

    public AbstractForestFactory() {
        this.factories = new HashMap<>();
        this.factories.put(0, new RectangularForestFactory());
        this.factories.put(1, new MagicHorizontalForestFactory());
        this.factories.put(2, new MagicVerticalForestFactory());
        this.factories.put(3, new MagicForestFactory());
    }

    @Override
    public Forest make(final int width, final int heigh, final int density) {
        return this.factories.get(0).make(width, heigh, density);
    }

    public Forest createForest(final int forestType, final int width, final int height, final int density){
        return switch (forestType){
            case 0 -> this.factories.get(0).make(width,height,density);
            case 1 -> this.factories.get(1).make(width,height,density);
            case 2 -> this.factories.get(2).make(width,height,density);
            case 3 -> this.factories.get(3).make(width,height,density);
            default -> throw new IllegalArgumentException("forestType not in bound.");
        };
    }
}
