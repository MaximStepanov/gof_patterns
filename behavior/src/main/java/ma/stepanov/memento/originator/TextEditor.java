package ma.stepanov.memento.originator;

import ma.stepanov.memento.snapshot.Memento;
import ma.stepanov.memento.snapshot.MementoImpl;

public class TextEditor {

    private String state;
    private String text;
    private int curPosition;

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCurPosition() {
        return curPosition;
    }

    public void setCurPosition(int curPosition) {
        this.curPosition = curPosition;
    }

    public MementoImpl saveStateToMemento(){
        return new MementoImpl(this, state, text, curPosition);
    }

    public void getStateFromMemento(Memento memento) {
        TextEditor editor = memento.restoreState();
        this.state = editor.state;
        this.text = editor.text;
        this.curPosition = editor.curPosition;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "state='" + state + '\'' +
                ", text='" + text + '\'' +
                ", curPosition=" + curPosition +
                '}';
    }
}
