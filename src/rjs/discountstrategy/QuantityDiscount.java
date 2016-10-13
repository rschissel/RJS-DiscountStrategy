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
    public QuantityDiscount(double minQty, double rate){
        this.minQuantity = minQty;
        this.rate = rate;
    }
    @Override
    public final double calculateDiscountAmount(double purchasedQuantity, double pricePerUnit) {
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
    public final double getMinQty() {
        return minQuantity;
    }

}
