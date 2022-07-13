package ma.stepanov.chain.requestprocessor;

import ma.stepanov.chain.onlineshop.Shop;
import ma.stepanov.chain.processingBean.PurchaseRequest;
import ma.stepanov.chain.requestprocessor.exception.InvalidCostException;
import ma.stepanov.chain.requestprocessor.exception.ProcessorException;

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
