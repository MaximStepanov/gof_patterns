package chain.requestprocessor;

import chain.onlineshop.Shop;
import chain.processingBean.PurchaseRequest;
import chain.requestprocessor.exception.InvalidCostException;
import chain.requestprocessor.exception.ProcessorException;

public class CostCheckingProcessor extends BaseProcessor {

    private final Shop shop;

    public CostCheckingProcessor(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void check(PurchaseRequest request) throws ProcessorException {
        if (!shop.checkCost(request)) {
            throw new InvalidCostException("No products with a cost lower than present");
        }
        checkNext(request);
    }
}
