package com.anderson.designpatterns.behavioral.memento;

public class Driver {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("HOLA");
        textEditor.write("COMO");
        textEditor.save();
        System.out.println(textEditor.print());
        textEditor.write("ESTAS ?");
        textEditor.undo();
        System.out.println(textEditor.print());
    }
}
