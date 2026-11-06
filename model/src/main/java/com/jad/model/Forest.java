package com.jad.model;

public interface Forest {
    public Boolean isPosXY(int x, int y);

    public Character getxy(int x, int y);

    public void makeRandomTrees(int density);

    public int getHeight();

    public int getWidth();
}
