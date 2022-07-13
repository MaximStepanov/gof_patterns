package ma.stepanov.chain.requestprocessor;

import ma.stepanov.chain.processingBean.PurchaseRequest;
import ma.stepanov.chain.requestprocessor.exception.ProcessorException;

public abstract class BaseProcessor {

    private BaseProcessor processor;

    public BaseProcessor setNextProcessor(BaseProcessor processor) {
        this.processor = processor;
        return processor;
    }


    public abstract void check(PurchaseRequest request) throws ProcessorException;

    public void checkNext(PurchaseRequest request) throws ProcessorException {
        if (processor == null) {
            return;
        }
        processor.check(request);
    }
}
