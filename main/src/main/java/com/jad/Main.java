package com.jad;

import com.jad.controller.Controller;
import com.jad.controller.IController;
import com.jad.model.IModel;
import com.jad.model.IScreen;
import com.jad.model.Model;
import com.jad.view.IView;
import com.jad.view.Tile;

import java.awt.*;

public enum Main {
    ;

    private static boolean imodel;

    public static void main(String[] args) {
        IModel model = new Model() {
            @Override
            public IScreen getScreen(Dimension dimension) {
                return null;
            }
        };
        IView view = new Tile(imodel);
        IController controller = new Controller(model, view);
        controller.proceed();
    }
}