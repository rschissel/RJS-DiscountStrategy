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
public class Product implements Validator {

    private String prodID;
    private String prodName;
    private double unitCost;
    private Discount discount;
    private String format = "P\\d\\d\\d";
    private String[] illegalChars = new String[]{"!", "@", "$", "%", "^", "*", "(", ")",
        "+", "[", "]", "{", "}", "|", "\'", "\"", "\\", "/", "<", ">", ".",
        ",", ":", ";"};
    public Product(String prodID, String prodName, double unitCost, Discount discount) {
        this.setProdID(prodID);
        this.setProdName(prodName);
        this.setUnitCost(unitCost);
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public final String getProdID() {
        return prodID;
    }

    public final void setProdID(String prodID) {
        if (!validate(prodID)){
                throw new IllegalArgumentException("Please enter a valid product ID.");
            }
        this.prodID = prodID;
    }

    public final String getProdName() {
        return prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    private void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
        public boolean validate(String input) {
        for (String i : illegalChars) {
            if (!input.matches(format) || input.equals(null) || input.contains(i)) {
               return false;
            }
        }
        return true;
    }
}
