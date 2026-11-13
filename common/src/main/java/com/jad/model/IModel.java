package com.jad.model;

import java.awt.*;

public interface IModel {

    IScreen getScreen(Dimension dimension, int x, int y);
    public int getWidth();
    public int getHeight();
}
