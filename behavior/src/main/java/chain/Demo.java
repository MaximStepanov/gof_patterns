package chain;

import chain.onlineshop.Product;
import chain.onlineshop.Shop;
import chain.processingBean.Country;
import chain.processingBean.Model;
import chain.processingBean.ProductType;
import chain.processingBean.PurchaseRequest;
import chain.requestprocessor.BaseProcessor;
import chain.requestprocessor.CheckFieldsProcessor;
import chain.requestprocessor.CostCheckingProcessor;
import chain.requestprocessor.ProductAbsenceProcessor;
import chain.requestprocessor.exception.ProcessorException;

import java.math.BigDecimal;

public class Demo {

    private static Shop shop;

    private static void initializeCase() {
        shop = new Shop();
        Product product1 = new Product();
        product1.productType = ProductType.SYNTH;
        product1.model = Model.URAL;
        product1.country = Country.RUS;
        product1.cost = BigDecimal.valueOf(100.50);
        Product product2 = new Product();
        product2.productType = ProductType.GUITAR;
        product2.model = Model.FENDER;
        product2.country = Country.USA;
        product2.cost = BigDecimal.valueOf(800.00);
        Product product3 = new Product();
        product3.productType = ProductType.DRUMS;
        product3.model = Model.YAMAHA;
        product3.country = Country.JAP;
        product3.cost = BigDecimal.valueOf(400.99);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        BaseProcessor processor = new CheckFieldsProcessor();
        processor.setNextProcessor(new ProductAbsenceProcessor(shop))
                .setNextProcessor(new CostCheckingProcessor(shop));

        shop.setProcessor(processor);
    }

    public static void main(String[] args) throws ProcessorException {
        initializeCase();
        PurchaseRequest request = new PurchaseRequest();
        request.productType = ProductType.GUITAR;
        request.country = Country.USA;
        request.model = Model.FENDER;
        request.email = "vasya@mail.ru";
        request.maxCost = BigDecimal.valueOf(1000);
        shop.purchase(request);

        PurchaseRequest badResuest = new PurchaseRequest();
        badResuest.productType = ProductType.STRINGS;
        badResuest.country = Country.USA;
        badResuest.model = Model.FENDER;
        badResuest.email = "vasya@mail.ru";
        badResuest.maxCost = BigDecimal.valueOf(1000);
        shop.purchase(badResuest);

        PurchaseRequest badResuest2 = new PurchaseRequest();
        badResuest2.productType = ProductType.STRINGS;
        badResuest2.email = "vasya@mail.ru";
        badResuest2.maxCost = BigDecimal.valueOf(1000);
        shop.purchase(badResuest2);

        PurchaseRequest badResuest3 = new PurchaseRequest();
        badResuest3.productType = ProductType.DRUMS;
        badResuest3.country = Country.JAP;
        badResuest3.model = Model.YAMAHA;
        badResuest3.email = "vasya@mail.ru";
        badResuest3.maxCost = BigDecimal.valueOf(300);
        shop.purchase(badResuest3);
    }
}
