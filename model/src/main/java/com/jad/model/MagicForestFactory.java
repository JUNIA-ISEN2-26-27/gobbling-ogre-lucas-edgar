package com.jad.model;

public class MagicForestFactory extends AbstractForestFactory{

    public MagicForestFactory() {
        super();
    }

    @Override
    public Forest make(final int width, final int heigh, final int density) {
        return new RectangularForest(width, heigh, density);
    }
}
