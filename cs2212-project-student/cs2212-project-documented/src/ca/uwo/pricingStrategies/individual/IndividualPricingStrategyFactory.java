/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uwo.pricingStrategies.individual;

/**
 *
 * @author Danish Amrohi
 */
public class IndividualPricingStrategyFactory {
//    TODO: need to be implemented properly
//    might be scheduled for Project 3
    public static IndividualPricingStrategy create(String s){
        switch(s){
            case "strategy1":
                return new IndividualPricingStrategy1();
            case "strategy2":
                return new IndividualPricingStrategy2();
            default:
                return new IndividualPricingStrategy1();
        }
    }
    
}
