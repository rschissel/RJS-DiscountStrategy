/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjs.discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Schissel
 */
public class VideoOutput implements ReceiptOutput{

    @Override
    public final void outputReceipt(Receipt receipt) {
        JOptionPane.showMessageDialog(null, receipt.getReceiptContents());
    }
    
}
