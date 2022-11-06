package org.designpattern.vistor;

import java.util.Random;

public class Manager extends Staff{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void visit(Vistor vistor) {
        vistor.visitManager(this);
    }

    public int getProduct() {
        return new Random().nextInt(10);
    }
}
