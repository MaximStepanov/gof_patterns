package chain.requestprocessor;

import chain.processingBean.PurchaseRequest;
import chain.requestprocessor.exception.ProcessorException;

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
