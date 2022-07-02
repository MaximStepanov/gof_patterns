package chain.requestprocessor.exception;

import chain.requestprocessor.BaseProcessor;

public class NoProductException extends ProcessorException {
    public NoProductException(String message) {
        super(message);
    }
}
