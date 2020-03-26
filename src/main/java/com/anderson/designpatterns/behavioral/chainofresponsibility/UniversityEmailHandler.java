package com.anderson.designpatterns.behavioral.chainofresponsibility;

public interface UniversityEmailHandler {
    void setTheNextHandlerInTheChain(UniversityEmailHandler emailHandler);
    void processEmailHandler(String emailText);
}
