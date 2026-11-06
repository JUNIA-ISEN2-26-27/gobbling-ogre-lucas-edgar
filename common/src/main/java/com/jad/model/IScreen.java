package com.jad.model;

import com.jad.view.Tile;

public interface IScreen {
    int getHeight();

    int getWidth();

    Tile getPixelAt(int x, int y);
}