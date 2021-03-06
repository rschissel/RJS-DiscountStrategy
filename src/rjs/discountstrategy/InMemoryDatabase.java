/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjs.discountstrategy;

import java.util.Arrays;

/**
 *
 * @author Ryan Schissel
 */
public class InMemoryDatabase implements DataStore {

    private Customer[] customers;
    private Product[] products;
    
     
    public InMemoryDatabase() {
        this.customers = new Customer[]{
            new Customer("Lucas", "Tepid", "C100"),
            new Customer("Ronda", "MacDonald-Berger", "C101"),
            new Customer("Anna", "Sassin", "C102")
        };

        this.products = new Product[]{
            new Product("P100", "Holy Crap! Holy Water", 6.66, new DiscountNotApplicable()),
            new Product("P101", "TrustBam Lie Detector", 12.99, new PercentageOffDiscount(.75)),
            new Product("P102", "Viva la Zapper Taser", 17.89, new QuantityDiscount(2, .1))
        };

    }

    @Override
    public final Customer findCustomerByID(String customerID) {
        Customer customer = null;
        for (Customer c : customers) {
            if (customerID.equals(c.getCustID())) {
                {
                    customer = c;
                    break;
                }
            }
        }
        return customer;
    }

    @Override
    public final Product findProductByID(String productID) {
        Product product = null;
        for (Product p : products) {
            if (productID.equals(p.getProdID())) {
                product = p;
                break;
            }
        }
        return product;
    }

}
