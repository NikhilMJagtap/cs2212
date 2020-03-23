/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uwo.model.item.states;

import ca.uwo.model.Item;
import ca.uwo.utils.ItemResult;
import ca.uwo.utils.ResponseCode;

/**
 *
 * @author Nikhil Jagtap
 */
public class LowStockState implements ItemState {

    @Override
    public ItemResult deplete(Item item, int quantity) {
       int remainingQuantity = item.getAvailableQuantity() - quantity;
       if(remainingQuantity >= 10) {
           item.setAvailableQuantity(remainingQuantity);
           item.setState(ItemStateFactory.create("AVAILABLE"));
           return new ItemResult("AVAILABLE", ResponseCode.Completed);
       } else if (remainingQuantity < 10 && remainingQuantity >=0){
           item.setAvailableQuantity(remainingQuantity);
           item.setState(ItemStateFactory.create("LOW STOCK"));
           return new ItemResult("LOW STOCK", ResponseCode.Completed);
       }
       else{
           item.setState(ItemStateFactory.create("OUT OF STOCK"));
           return new ItemResult("OUT OF STOCK", ResponseCode.Not_Completed);
       }
    }

    @Override
    public ItemResult replenish(Item item, int quantity) {
        item.setAvailableQuantity(quantity + item.getAvailableQuantity());
        item.notifyViewers();
        return new ItemResult("RESTOCKED", ResponseCode.Completed);
    }
    
}
