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
public class ConsoleOutput implements ReceiptOutput{

    @Override
    public final void outputReceipt(Receipt receipt) {
        System.out.println(receipt.getReceiptContents());
    }

    
}
