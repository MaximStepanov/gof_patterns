package chain.requestprocessor.exception;

public class ProcessorException extends Exception {
    public ProcessorException(String fieldsPresent) {
        super(fieldsPresent);
    }
}
