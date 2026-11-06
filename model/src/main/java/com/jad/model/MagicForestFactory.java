package com.jad.model;

public class MagicForestFactory implements ForestFactory{

    public MagicForestFactory() {
        super();
    }

    @Override
    public Forest make(final int width, final int heigh, final int density) {
        return new MagicForest(width, heigh, density);
    }
}
