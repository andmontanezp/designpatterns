package com.anderson.designpatterns.behavioral.memento;

public class TextEditor implements Caretaker {

    private TextWindow textWindow;
    private TextWindowState textWindowState;


    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return textWindow.getCurrentText();
    }

    @Override
    public void save() {
        textWindowState = textWindow.save();
    }

    @Override
    public void undo() {
        textWindow.restore(textWindowState);
    }
}
