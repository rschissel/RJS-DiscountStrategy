/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjs.discountstrategy;

import java.util.Arrays;

/**
 *
 * @author Ryan Schissel
 */
public class Receipt {
    
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private DataStore ds = new InMemoryDatabase();
    private double subtotal;
    private double total;

    public Receipt(String customerID) {
        this.customer = ds.findCustomerByID(customerID);
    }

    public final void addProduct(String productID, Discount discount, double quantity) {
       LineItem[] temp = new LineItem[lineItems.length + 1];
       for(int l = 0; l > temp.length; l++){
           temp[l].setProduct(ds.findProductByID(productID));
           temp[l].setDiscount(discount);
           temp[l].setQty(quantity);
       }
       System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
    }

    public final void applyDiscount(Discount discount, double purchasedQuantity, double discountedAmount) {
        for (LineItem l : lineItems) {
            this.subtotal += l.getUnitCost();
            this.total = discount.calculateDiscountAmount(l.getDiscount().getMinQty(), purchasedQuantity, discountedAmount, l.getUnitCost());
        }
    }

    public final String getReceiptContents() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer Name: ");
        sb.append(this.customer.getFirstName());
        sb.append(" ");
        sb.append(this.customer.getLastName());
        for (LineItem l : lineItems) {
            sb.append("\nProduct Name: ");
            sb.append(l.getProduct().getProdName());
            sb.append("\nProduct ID: ");
            sb.append(l.getProduct().getProdID());
            sb.append("\nQuantity: ");
            sb.append(l.getQty());
            sb.append("\nPrice: ");
            sb.append(l.getUnitCost());
            sb.append("\nSubtotal: ");
            sb.append(this.subtotal);
            sb.append("\nTotal: ");
            sb.append(this.total);
        }
        return sb.toString();
    }
    
}
