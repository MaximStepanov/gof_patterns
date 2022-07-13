package ma.stepanov.chain.requestprocessor;

import ma.stepanov.chain.processingBean.PurchaseRequest;
import ma.stepanov.chain.requestprocessor.exception.ProcessorException;
import ma.stepanov.chain.requestprocessor.exception.RequiredFieldsException;

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
