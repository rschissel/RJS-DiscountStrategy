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
public class OutputManager{
    private ReceiptOutput output;
   
    public OutputManager(ReceiptOutput output){
        this.output = output;
    }
    
    public final void doOutput(Receipt receipt) {
      output.outputReceipt(receipt);
    }
    
}
