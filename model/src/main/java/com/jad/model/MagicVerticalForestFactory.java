package com.jad.model;

public class MagicVerticalForestFactory implements ForestFactory{

    public MagicVerticalForestFactory() {
        super();
    }

    @Override
    public Forest make(final int width, final int heigh, final int density) {
        return new MagicVerticalForest(width, heigh, density);
    }
}
