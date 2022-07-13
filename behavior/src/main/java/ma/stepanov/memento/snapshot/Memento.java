package ma.stepanov.memento.snapshot;

import ma.stepanov.memento.originator.TextEditor;

public interface Memento {

    TextEditor restoreState();
}
