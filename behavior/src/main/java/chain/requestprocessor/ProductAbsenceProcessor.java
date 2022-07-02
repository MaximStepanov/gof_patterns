package chain.requestprocessor;

import chain.onlineshop.Shop;
import chain.processingBean.PurchaseRequest;
import chain.requestprocessor.exception.NoProductException;
import chain.requestprocessor.exception.ProcessorException;

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
