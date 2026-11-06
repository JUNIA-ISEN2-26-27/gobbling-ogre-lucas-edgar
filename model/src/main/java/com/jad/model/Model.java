package com.jad.model;

import java.awt.*;

public abstract class Model implements IModel {

    public Model() {
        AbstractForestFactory factory = new AbstractForestFactory();
        Forest forest = factory.createForest(0, 50, 10, 10);
        for (int row = -1; row < forest.getHeight()+1; row++) {
            for (int column = -1; column < forest.getWidth()+1; column++) {
                System.out.print(forest.getxy(column, row));
            }
            System.out.println();
        }
    }
}
