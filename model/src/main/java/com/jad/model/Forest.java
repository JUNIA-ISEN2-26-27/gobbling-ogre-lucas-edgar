package com.jad.model;

import java.awt.*;

public interface Forest {
    public Boolean isPosXY(int x, int y);

    public Character getxy(int x, int y);

    Object getTile(Point point);

    int getWidth();

    int getHeight();
}
