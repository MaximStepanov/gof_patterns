package ma.stepanov.chain.requestprocessor;

import ma.stepanov.chain.onlineshop.Shop;
import ma.stepanov.chain.processingBean.PurchaseRequest;
import ma.stepanov.chain.requestprocessor.exception.NoProductException;
import ma.stepanov.chain.requestprocessor.exception.ProcessorException;

public class ProductAbsenceProcessor extends BaseProcessor {

    private final Shop shop;

    public ProductAbsenceProcessor(Shop shop) {
        this.shop = shop;
    }


    @Override
    public void check(PurchaseRequest request) throws ProcessorException {
        if (!shop.checkAbsence(request)) {
            throw new NoProductException("No such product in shop");
        }
        checkNext(request);
    }
}
