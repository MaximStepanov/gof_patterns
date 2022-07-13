package ma.stepanov.memento;

import ma.stepanov.memento.caretaker.CareTaker;
import ma.stepanov.memento.originator.TextEditor;

public class Demo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();

        editor.setState("1");
        editor.setText("some text");
        editor.setCurPosition(4);
        careTaker.add(editor.saveStateToMemento());

        editor.setState("2");
        editor.setText("some text and one more");
        editor.setCurPosition(22);
        careTaker.add(editor.saveStateToMemento());

        System.out.println("Current state: " + editor.toString());

        editor.setState("3");
        editor.setText("some text and one more AND MORE");
        editor.setCurPosition(31);

        System.out.println("Current state: " + editor.toString());

        editor.getStateFromMemento(careTaker.getLast());
        System.out.println("Current state: " + editor.toString());

        editor.getStateFromMemento(careTaker.getLast());
        System.out.println("Current state: " + editor.toString());
    }
}
