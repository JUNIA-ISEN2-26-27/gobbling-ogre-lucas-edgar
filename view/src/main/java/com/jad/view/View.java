package com.jad.view;

import com.jad.controller.IController;
import com.jad.model.IModel;
import com.jad.model.IScreen;
import com.jad.textwindow.TextWindow;
import com.jad.textwindow.TextWindowSettings;
import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class View implements IView {
    private final IModel model;
    private final TextWindow textWindow;
    private IController controller;

    public View(final IModel model) {
        this.model = model;
        TextWindowSettings textWindowSettings = new TextWindowSettings();
        textWindowSettings.setTitle("GoblingOgre");
        textWindowSettings.setScreenHeight((model.getHeight()+2)*3);
        textWindowSettings.setScreenWidth((model.getWidth()+2)*6);
        textWindowSettings.setFontSize(9f);
        this.textWindow = new TextWindow(textWindowSettings);
        this.textWindow.setVisible(true);
    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override
    public void display() {
        IScreen screen = this.model.getScreen(new Dimension(model.getWidth()+1, model.getHeight()+1), 600, 10);
        StringBuilder screenTxt = new StringBuilder();
        for (int y = -1; y <= screen.getHeight(); y++) {
            for (int i = 0; i < 3; i++){
                for (int x = -1; x <= screen.getWidth(); x++) {
                    for (int j = 0; j < 6; j++){
                        screenTxt.append(screen.getxy(x, y)[i][j]);
                    }
                }
                screenTxt.append("\n");
            }
        }
        this.textWindow.display(screenTxt.toString());
    }
}
