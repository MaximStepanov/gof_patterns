package chain.onlineshop;

import chain.processingBean.PurchaseRequest;
import chain.requestprocessor.BaseProcessor;
import chain.requestprocessor.exception.ProcessorException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private final List<Product> productList = new ArrayList<>();
    private BaseProcessor processor;

    public void setProcessor(BaseProcessor processor) {
        this.processor = processor;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public boolean checkAbsence(PurchaseRequest request) {
        return !findProducts(request).isEmpty();
    }

    public boolean checkCost(PurchaseRequest request) {
        return findProducts(request).stream().anyMatch(product -> product.cost.compareTo(request.maxCost) < 0);
    }

    private List<Product> findProducts(PurchaseRequest request) {
        return productList.stream().filter(product -> product.productType == request.productType
                && (product.model == request.model || product.country == request.country))
                .collect(Collectors.toList());
    }

    public void purchase(PurchaseRequest request) throws ProcessorException {
        try {
            processor.check(request);
            System.out.println("Order purchased! Sent tracking code to " + request.email);
        } catch (ProcessorException e) {
            System.out.println(e.getMessage());
        }
    }
}
