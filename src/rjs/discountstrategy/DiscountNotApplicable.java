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
public class DiscountNotApplicable implements Discount {
    private double minQuantity = 0;
    
    @Override
     public final double calculateDiscountAmount(double purchasedQuantity, double pricePerUnit) {
        return 0.0;
    }

   @Override
    public final double getMinQty() {
        return minQuantity;
    }

   
}
