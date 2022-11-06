package org.designpattern.vistor;

public class CEOVistor implements Vistor{
    @Override
    public void visitEngineer(Engineer engineer) {
        System.out.println(engineer.name + " " + engineer.getCode());
    }

    @Override
    public void visitManager(Manager manager) {
        System.out.println(manager.name + " " + manager.getProduct());
    }
}
