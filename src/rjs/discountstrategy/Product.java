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
public class Product {

    private String prodID;
    private String prodName;
    private double unitCost;
    
    public Product(String prodID, String prodName, double unitCost) {
        this.setProdID(prodID); 
        this.setProdName(prodName);
        this.setUnitCost(unitCost);
    }

    public final String getProdID() {
        return prodID;
    }

    public final void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

   
}