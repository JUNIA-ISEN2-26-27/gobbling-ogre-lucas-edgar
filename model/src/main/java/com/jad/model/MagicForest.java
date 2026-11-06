package com.jad.model;

import java.awt.*;

public class MagicForest extends AbstractForest{
    public MagicForest(final int width, final int heigh, final int density) {
        super(new Dimension(width, heigh), density, true, true);
    }
}
