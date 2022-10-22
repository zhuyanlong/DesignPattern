package org.designpattern.observer;

public class Test {
    public static void main(String[] args) {
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        Observer1 observer1 = new Observer1(subjectFor3d);
        Observer2 observer2 = new Observer2(subjectFor3d);

        subjectFor3d.setMsg("hi");
        subjectFor3d.setMsg("hello");
    }
}
