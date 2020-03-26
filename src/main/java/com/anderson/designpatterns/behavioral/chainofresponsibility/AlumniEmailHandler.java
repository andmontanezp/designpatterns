package com.anderson.designpatterns.behavioral.chainofresponsibility;

public class AlumniEmailHandler extends MainEmailHandler {

    @Override
    protected String[] keyWords() {
        return new String[] {"alumni", "transcript"};
    }

    @Override
    protected void processEmailFinal(String emailText) {
        System.out.println("Alumni");
    }
}
