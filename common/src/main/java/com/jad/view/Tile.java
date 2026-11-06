package com.jad.view;

import com.jad.controller.IController;

public record Tile(boolean obstacle) implements IView {

    @Override
    public void setController(IController controller) {

    }

    @Override
    public void diplay() {

    }
}