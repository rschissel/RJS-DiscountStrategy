/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjs.discountstrategy;

/**
 *
 * @author Ryan Schissel
 */
public class QuantityDiscount implements Discount {

    private double minQuantity;
    private double rate;
    public QuantityDiscount(double quantity, double rate){
        this.minQuantity = quantity;
        this.rate = rate;
    }
    @Override
    public double calculateDiscountAmount(double minQuantity, double purchasedQuantity, double discountedQuantity, double pricePerUnit) {
        if (validateQuantity(purchasedQuantity)) {
            return pricePerUnit - (this.rate * pricePerUnit);
        } else {
            return pricePerUnit;
        }
    }

    private boolean validateQuantity(double purchasedQuantity) {
        if (purchasedQuantity >= this.minQuantity) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getMinQty() {
        return minQuantity;
    }

}
