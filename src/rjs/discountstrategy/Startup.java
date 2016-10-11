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
        posTerm.createSale(customerID);
        posTerm.addDiscountedProductToSale("P100", 1, new DiscountNotApplicable(), 0);
        posTerm.addDiscountedProductToSale("P102", 2, new PercentageOffDiscount(25), 1);
        posTerm.addDiscountedProductToSale("P103", 3, new QuantityDiscount(2, 1), 2);
        posTerm.endSale();
    }
}
