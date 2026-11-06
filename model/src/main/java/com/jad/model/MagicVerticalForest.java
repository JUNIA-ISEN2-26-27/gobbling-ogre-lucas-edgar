package com.jad.model;

import java.awt.*;

public class MagicVerticalForest extends AbstractForest{
    public MagicVerticalForest(final int width, final int heigh, final int density) {
        super(new Dimension(width, heigh), density, false, true);
    }
}
