package org.designpattern.observer;

public class Observer1 implements Observer {
    private Subject subject;
    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer1"+ msg);
    }
}
