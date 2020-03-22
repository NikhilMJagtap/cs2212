/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uwo.model.item.states;
/**
 *
 * @author Nikhil Jagtap
 */
public class ItemStateFactory {

    public static ItemState create(String type) {
        switch(type){
            case "AVAILABLE":
                return new InStockState();
            case "LOW STOCK":
                return new LowStockState();
            case "OUT OF STOCK":
                return new OutOfStockState();
            default:
                return null;
        }
    }
    
}
