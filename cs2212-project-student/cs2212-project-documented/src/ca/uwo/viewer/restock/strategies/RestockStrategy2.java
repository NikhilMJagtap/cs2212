/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uwo.viewer.restock.strategies;

/**
 *
 * @author Nikhil Jagtap
 */
public class RestockStrategy2 implements RestockStrategy {

    @Override
    public int calculateQuantity(String itemName, int quantity, double price) {
        if(itemName.equals("apple"))
            return 100;
        return 25;
    }
    
}
