package com.anderson.designpatterns.behavioral.memento;

public class TextWindow implements Originator<TextWindowState> {

    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    @Override
    public TextWindowState save() {
        return new TextWindowState(this.currentText.toString());
    }

    @Override
    public void restore(TextWindowState textWindowState) {
        currentText = new StringBuilder(textWindowState.getText());
    }

    public String getCurrentText() {
        return currentText.toString();
    }
}
