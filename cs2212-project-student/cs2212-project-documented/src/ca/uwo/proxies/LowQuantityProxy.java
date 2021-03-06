/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uwo.proxies;

import ca.uwo.client.Buyer;
import ca.uwo.client.Supplier;
import ca.uwo.frontend.Facade;
import java.util.Map;

/**
 *
 * @author Danish Amrohi
 */
public class LowQuantityProxy extends Proxy {

    private static LowQuantityProxy instance;
    
    @Override
    public void placeOrder(Map<String, Integer> orderDetails, Buyer buyer) {
        if(orderDetails.size() > 10){
            System.out.println("Low Quantity Order. Processing...");
//            Facade facade = new Facade();
            Facade facade = Facade.getInstance();
            facade.placeOrder(orderDetails, buyer);
        } else{
            HighQuantityProxy proxy = HighQuantityProxy.getInstance();
            proxy.placeOrder(orderDetails, buyer);
        }
    }

    @Override
    public void restock(Map<String, Integer> restockDetails, Supplier supplier) {
        //TODO:        
    }
    
    public static LowQuantityProxy getInstance(){
        if(instance == null)
            instance = new LowQuantityProxy();
        return instance;
    }
    
}
