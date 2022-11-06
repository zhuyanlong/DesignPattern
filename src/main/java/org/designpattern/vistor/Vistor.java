package org.designpattern.vistor;

public interface Vistor {
    public abstract void visitEngineer(Engineer engineer);

    public abstract void visitManager(Manager manager);
}
