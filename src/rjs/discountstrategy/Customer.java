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
public class Customer implements Validator{

    private String custID;
    private String firstName;
    private String lastName;
    private String format = "C\\d\\d\\d";
    String[] illegalChars = new String[]{"!", "@", "$", "%", "^", "*", "(", ")",
        "+", "[", "]", "{", "}", "|", "\'", "\"", "\\", "/", "<", ">", ".",
        ",", ":", ";"};

    public Customer(String firstName, String lastName, String custID) throws IllegalArgumentException {
        this.setCustID(custID);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public final String getCustID() {
        return custID;
    }

    public final void setCustID(String custID) {
            if (!validate(custID)) {
                throw new IllegalArgumentException("Please enter a valid customer ID.");
            }
            this.custID = custID;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
            if (!validate(firstName)) {
                throw new IllegalArgumentException("Please enter a valid first name");
            }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
            if (!validate(lastName)) {
                throw new IllegalArgumentException("Please enter a valid last name");
            }
        this.lastName = lastName;
    }
    @Override
    public boolean validate(String input) {
        for (String i : illegalChars){
            if (!input.contains(i) || input.matches(format)||input.equals(null)){
                return true;
            }
        }
        return false;  
    }
}
