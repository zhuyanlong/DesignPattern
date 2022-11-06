package org.designpattern.vistor;

import java.util.Random;

public class Engineer extends Staff{
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void visit(Vistor vistor) {
        vistor.visitEngineer(this);
    }

    public int getCode() {
        return new Random().nextInt(1000);
    }
}
