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
public interface DataStore {

    public abstract Customer findCustomerByID(String customerID);

    public abstract Product findProductByID(String ProductID);
   
}
