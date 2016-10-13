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
    private ReceiptOutput output = new ConsoleOutput();
    private OutputManager om = new OutputManager(output);
    
    public final void createSale(String customerID, DataStore ds) {
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
