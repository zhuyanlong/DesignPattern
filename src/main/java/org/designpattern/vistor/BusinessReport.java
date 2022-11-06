package org.designpattern.vistor;

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {
    private List<Staff> myStaffs;

    public BusinessReport() {
        myStaffs = new ArrayList<>();
        myStaffs.add(new Engineer("wang"));
        myStaffs.add(new Manager("li"));
    }

    public void report(Vistor vistor) {
        for (Staff staff : myStaffs) {
            staff.visit(vistor);
        }
    }
}
