package com.anderson.designpatterns.behavioral.chainofresponsibility;

public class AcademicEmailHandler extends MainEmailHandler {

    @Override
    protected String[] keyWords() {
        return new String[] {"academic"};
    }

    @Override
    protected void processEmailFinal(String emailText) {
        System.out.println("Alumni");
    }
}
