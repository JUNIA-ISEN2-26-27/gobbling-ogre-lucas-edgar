package com.jad.model;

import com.jad.view.Tile;

public interface IScreen {
    int getHeight();

    int getWidth();

    Character[][] getxy(int x, int y);
}