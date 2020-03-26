package com.anderson.designpatterns.behavioral.chainofresponsibility;

public abstract class MainEmailHandler implements UniversityEmailHandler {

    private UniversityEmailHandler theNextHandlerInTheChain;

    public void setTheNextHandlerInTheChain(UniversityEmailHandler emailHandler) {
        this.theNextHandlerInTheChain = emailHandler;
    }

    @Override
    public void processEmailHandler(String emailText) {
        boolean keyworkFound = false;

        if (keyWords().length == 0) {
            keyworkFound = true;
        } else {
            for (String oneKeyWord: keyWords()) {
                if (emailText.contains(oneKeyWord)) {
                    keyworkFound = true;
                    break;
                }
            }
        }

        if (keyworkFound) {
            processEmailFinal(emailText);
        } else {
            theNextHandlerInTheChain.processEmailHandler(emailText);
        }
    }

    public static void handleEmail(String emailText) {
        UniversityEmailHandler academic = new AcademicEmailHandler();
        UniversityEmailHandler alumni = new AlumniEmailHandler();

        academic.setTheNextHandlerInTheChain(alumni);

        academic.processEmailHandler(emailText);
    }


    public static void main(String[] args) {
        MainEmailHandler.handleEmail("alumni");
    }

    protected abstract String[] keyWords();
    protected abstract void processEmailFinal(String emailText);
}
