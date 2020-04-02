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

/**
 * @param s String to define restock strategy. 
 * Can be weird or units
 */
public class RestockStrategyFactory {
    public static RestockStrategy create(String s){
        switch(s){
            case "units":
                return new Units50RestockStrategy();
            case "weird":
                return new WeirdRestockStrategy();
            case "strategy1":
                return new RestockStrategy1();
            case "strategy2":
                return new RestockStrategy2();
            default:
                return new Units50RestockStrategy();
        }
    }
}
