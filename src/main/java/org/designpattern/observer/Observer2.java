package org.designpattern.observer;

public class Observer2 implements Observer {
    private Subject subject;
    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer2" + msg);
    }
}
