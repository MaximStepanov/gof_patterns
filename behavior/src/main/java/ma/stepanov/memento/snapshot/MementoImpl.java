package ma.stepanov.memento.snapshot;

import ma.stepanov.memento.originator.TextEditor;

public class MementoImpl implements Memento {

    private final TextEditor editor;
    private final String state;
    private final String text;
    private final int curPosition;

    public MementoImpl(TextEditor editor, String state, String text, int curPosition){
        this.editor = editor;
        this.state = state;
        this.text = text;
        this.curPosition = curPosition;
    }

    @Override
    public TextEditor restoreState() {
        editor.setState(state);
        editor.setText(text);
        editor.setCurPosition(curPosition);
        return editor;
    }
}
