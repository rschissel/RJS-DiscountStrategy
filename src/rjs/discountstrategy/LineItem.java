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
    private double qty;
    private DataStore db;
    
    public LineItem(String productID, double quantity, DataStore db){
        this.setDb(db);
        this.setQty(quantity);
        this.product = db.findProductByID(productID);
    }

    public final double getQty() {
        return qty;
    }

    public final void setQty(double qty) {
        
        this.qty = qty;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final DataStore getDb() {
        return db;
    }

    public final void setDb(DataStore db) {
        this.db = db;
    }
    
}
