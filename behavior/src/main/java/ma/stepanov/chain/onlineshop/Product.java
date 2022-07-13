package ma.stepanov.chain.onlineshop;

import ma.stepanov.chain.processingBean.Country;
import ma.stepanov.chain.processingBean.Model;
import ma.stepanov.chain.processingBean.ProductType;

import java.math.BigDecimal;

public class Product {

    public ProductType productType;
    public Country country;
    public Model model;
    public BigDecimal cost;
}
