package com.thoughtworks.codepairing.model;

/**
 * 订单实体类 Order
 * totalPrice double
 * loyaltyPoints int
 * Order(double totalPrice, int loyaltyPointsEarned)
 * getTotalPrice() getLoyaltyPoints()
 * toString()
 * */
public class Order {
    private double totalPrice;
    private int loyaltyPoints;

    public Order(double totalPrice, int loyaltyPointsEarned) {
        this.totalPrice = totalPrice;
        this.loyaltyPoints = loyaltyPointsEarned;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Total price: " + totalPrice + "\n" + "Will receive " + loyaltyPoints + " loyalty points";
    }
}
