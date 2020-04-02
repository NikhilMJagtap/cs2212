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
public class IndividualPricingStrategy2 implements IndividualPricingStrategy{

    @Override
    public double calculate(int quantity, double price) {
        // giving 10% discount
        return quantity*price*0.9;
    }
    
}
