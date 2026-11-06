package com.jad.model;

import java.awt.*;

public class RectangularForest extends AbstractForest{
    public RectangularForest(final int width, final int heigh, final int density) {
        super(new Dimension(width, heigh), density, false, false);
    }
}
