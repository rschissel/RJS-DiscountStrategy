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
public interface Discount {
        public abstract double calculateDiscountAmount(double minQuantity,double purchasedQuantity, double discountedQuantity, double pricePerUnit);
        public abstract double getMinQty();
    
}
