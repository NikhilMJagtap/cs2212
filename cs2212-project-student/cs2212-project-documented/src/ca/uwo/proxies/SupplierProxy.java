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
 * @author Nikhil Jagtap
 */
public class SupplierProxy extends Proxy {

    @Override
    public void placeOrder(Map<String, Integer> orderDetails, Buyer buyer) {
        LowQuantityProxy proxy = new LowQuantityProxy();
        proxy.placeOrder(orderDetails, buyer);
    }

    @Override
    public void restock(Map<String, Integer> restockDetails, Supplier supplier) {
        Facade facade = new Facade();
        facade.restock(restockDetails, supplier);
    }
    
}
