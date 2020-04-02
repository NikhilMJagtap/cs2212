/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uwo.pricingStrategies.individual;

/**
 *
 * @author Nikhil Jagtap
 */
public class IndividualPricingStrategy1 implements IndividualPricingStrategy{

    @Override
    public double calculate(int quantity, double price) {
        // returning just price
        return quantity*price;
    }
    
}
