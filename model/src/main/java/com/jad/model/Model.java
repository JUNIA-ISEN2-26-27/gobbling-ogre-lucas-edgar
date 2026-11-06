package com.jad.model;

import java.awt.*;

public abstract class Model implements IModel {

    public Model() {
        AbstractForestFactory factory = new AbstractForestFactory();
        Forest forest = factory.createForest(ForestType.HORIZONTAL_MAGIC, 50, 10, 0, 1);
        for (int row = 0; row < forest.getHeight(); row++) {
            for (int column = 0; column < forest.getWidth(); column++) {
                System.out.print(forest.getTile(new Point(column, row)).getClass());
            }
            System.out.println();
        }
    }
}
