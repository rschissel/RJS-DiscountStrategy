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
public class Customer {
    private String custID;
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName, String custID) {
        this.setCustID(custID);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public final String getCustID() {
        return custID;
    }

    public final void setCustID(String custID) {
        this.custID = custID;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
