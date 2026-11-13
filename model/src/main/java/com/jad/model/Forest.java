package com.jad.model;

import java.awt.*;

public interface Forest {
    public Boolean isPosXY(int x, int y);

    public Character[][] getxy(int x, int y);

    public Character[][][][] getx1y1x2y2(int x1, int y1, int x2, int y2);

    public void makeRandomTrees(int density);

    public int getHeight();

    public int getWidth();

    public Dimension getDimension();

    public Boolean getWrapHorizontal();
    public Boolean getWrapVertical();
}
