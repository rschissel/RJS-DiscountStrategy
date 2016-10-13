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
public class Receipt{
    
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private DataStore ds;
    private double total;
    public Receipt(String customerID, DataStore ds) {
        this.ds = ds;
        this.customer = ds.findCustomerByID(customerID);
    }

    public final void addProduct(String productID, double quantity, DataStore ds) {
       LineItem item = new LineItem(productID,quantity, ds);
       LineItem[] temp = new LineItem[lineItems.length + 1];
       System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
       temp[temp.length-1] = item;
       lineItems = temp;
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
            sb.append(l.getProduct().getUnitCost());
            sb.append("\nDiscount: ");
            sb.append(l.getProduct().getDiscount().calculateDiscountAmount(l.getQty(), l.getProduct().getUnitCost()));
            sb.append("\nSubtotal: ");
            double subtotal = l.getQty() * l.getProduct().getUnitCost();
            total +=  subtotal;
            sb.append(subtotal);
            
        }
        
        sb.append("\nGrand Total: ");
        sb.append(total);
        return sb.toString();
    }

}
