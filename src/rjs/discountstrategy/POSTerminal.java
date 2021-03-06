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
public class POSTerminal {
    private DataStore ds;
    private Receipt receipt;
    private ReceiptOutput output;
    private OutputManager om;
    public final void createSale(String customerID, DataStore ds, ReceiptOutput output, OutputManager om) {
        this.output = output;
        this.om = om;
        this.ds = ds;
         this.receipt = new Receipt(customerID, ds);
    }

    public final void endSale() {
       om.doOutput(receipt);
       
    }

    public final void addDiscountedProductToSale(String productID, double purchasedQuantity) {
       receipt.addProduct(productID, purchasedQuantity, ds);
    }
}
