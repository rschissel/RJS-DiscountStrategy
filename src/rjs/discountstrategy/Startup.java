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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String customerID = "C102";
        POSTerminal posTerm = new POSTerminal();
        DataStore ds = new InMemoryDatabase();
        posTerm.createSale(customerID, ds);
        posTerm.addDiscountedProductToSale("P100", 1);
        posTerm.addDiscountedProductToSale("P101", 2);
        posTerm.addDiscountedProductToSale("P102", 3);
        posTerm.endSale();
        
    }
}
