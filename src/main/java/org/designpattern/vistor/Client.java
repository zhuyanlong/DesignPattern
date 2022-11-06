package org.designpattern.vistor;

public class Client {
    public static void main(String[] args) {
        CTOVistor ctoVistor = new CTOVistor();
        CEOVistor ceoVistor = new CEOVistor();
        BusinessReport businessReport = new BusinessReport();
        businessReport.report(ceoVistor);
        businessReport.report(ctoVistor);
    }
}
