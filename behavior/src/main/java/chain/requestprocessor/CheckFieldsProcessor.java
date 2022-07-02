package chain.requestprocessor;

import chain.processingBean.PurchaseRequest;
import chain.requestprocessor.exception.ProcessorException;
import chain.requestprocessor.exception.RequiredFieldsException;

public class CheckFieldsProcessor extends BaseProcessor {

    @Override
    public void check(PurchaseRequest request) throws ProcessorException {
        if (request.productType == null || request.email == null
                || (request.country == null && request.model == null)) {
            throw new RequiredFieldsException("Not all required fields present");
        }
        checkNext(request);
    }
}
