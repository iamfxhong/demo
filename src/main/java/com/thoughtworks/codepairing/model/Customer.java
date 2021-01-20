package com.thoughtworks.codepairing.model;

/**
 * 顾客实体类 Customer
 * name String
 * Customer(String name)
 * getName
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}