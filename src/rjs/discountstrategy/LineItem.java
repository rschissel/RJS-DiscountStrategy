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
public class LineItem {

    private Product product;
    private Discount discount;
    private double unitCost;
    private double qty;
    
    public LineItem(Product product, Discount discount, double quantity){
        this.setProduct(product);
        this.setDiscount(discount);
        this.setUnitCost(product.getUnitCost());
        this.setQty(quantity);
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }
    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
