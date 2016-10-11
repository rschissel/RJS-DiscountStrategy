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
public class PercentageOffDiscount implements Discount{
    private double percentage;
    private double minQuantity = 0;
   public PercentageOffDiscount(double percentage){
        this.percentage = percentage;
   }
    
    @Override
     public double calculateDiscountAmount(double minQuantity, double purchasedQuantity, double discountedQuantity, double pricePerUnit) {
        this.minQuantity = minQuantity;
        return (pricePerUnit - (pricePerUnit * this.percentage)) * purchasedQuantity;
    }

    @Override
    public double getMinQty() {
        return minQuantity;
    }

   

}
