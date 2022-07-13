package ma.stepanov.memento.caretaker;

import ma.stepanov.memento.snapshot.Memento;

import java.util.Stack;

public class CareTaker {

    Stack<Memento> meMentos = new Stack<>();

    public void add(Memento memento) {
        meMentos.add(memento);
    }

    public Memento getLast() {
        if (!meMentos.empty()) {
            return meMentos.pop();
        }
        return null;
    }
}
