package org.designpattern.vistor;

public class CTOVistor implements Vistor{
    @Override
    public void visitEngineer(Engineer engineer) {
        System.out.println(engineer.kpi + " " + engineer.getCode());
    }

    @Override
    public void visitManager(Manager manager) {
        System.out.println(manager.kpi + " " + manager.getProduct());
    }
}
