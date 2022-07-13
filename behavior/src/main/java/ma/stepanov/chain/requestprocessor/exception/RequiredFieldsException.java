package ma.stepanov.chain.requestprocessor.exception;

public class RequiredFieldsException extends ProcessorException {
    public RequiredFieldsException(String fieldsPresent) {
        super(fieldsPresent);
    }
}
