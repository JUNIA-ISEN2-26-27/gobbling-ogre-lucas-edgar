package com.jad.model;

import java.awt.*;

public class RectangularForestFactory extends AbstractForestFactory{

    public RectangularForestFactory() {
        super();
    }

    @Override
    public Forest make(final int width, final int heigh, final int density) {
        return new RectangularForest(width, heigh, density);
    }
}
