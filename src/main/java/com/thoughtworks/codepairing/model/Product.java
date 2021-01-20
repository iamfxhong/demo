package com.thoughtworks.codepairing.model;

/**
 * 商品类 Product
 * final double price //final变量初始化值可以直接赋值或者通过构造函数进行初始化
 * final String productCode
 * final String name
 * Product(double price, String productCode, String name)
 * getPrice()
 * getProductCode()
 * getName()
 */
public class Product {
    private final double price;
    private final String productCode;
    private final String name;

    public Product(double price, String productCode, String name) {
        this.price = price;
        this.productCode = productCode;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }
}
