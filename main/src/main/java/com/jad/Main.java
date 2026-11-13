package com.jad;

import com.jad.controller.Controller;
import com.jad.controller.IController;
import com.jad.model.IModel;
import com.jad.model.IScreen;
import com.jad.model.Model;
import com.jad.view.IView;
import com.jad.view.Tile;
import com.jad.view.View;

import java.awt.*;

public enum Main {
    ;

    public static void main(String[] args) {
        Model model = new Model();
        IView view = new View(model);
        IController controller = new Controller(model, view);
        controller.proceed();
    }
}