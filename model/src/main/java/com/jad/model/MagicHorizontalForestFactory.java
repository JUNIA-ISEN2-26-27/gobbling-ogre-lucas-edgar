package com.jad.model;

public class MagicHorizontalForestFactory implements ForestFactory{


    public MagicHorizontalForestFactory() {
        super();
    }


    @Override
    public Forest make(final int width, final int heigh, final int density) {
        return new MagicHorizontalForest(width, heigh, density);
    }
}
