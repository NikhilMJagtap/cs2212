package ca.uwo.proxies;

import java.util.Map;

import ca.uwo.client.Buyer;
import ca.uwo.client.Supplier;
import ca.uwo.frontend.Facade;

/**
 * @author kkontog, ktsiouni, mgrigori
 * This is one concrete implementation of {@link ca.uwo.proxies.Proxy} base class, it is the first proxy
 * the {@link ca.uwo.client.Client} will encounter. If the request of client is not issued by this class, 
 * it is forwarded to the {@link ca.uwo.proxies.SupplierProxy}, then {@link ca.uwo.proxies.LowQuantityProxy}, 
 * lastly {@link ca.uwo.proxies.HighQuantityProxy}. The link between those proxies implements Chain of Responsibility 
 * design pattern.
 */
public class WelcomeProxy extends Proxy {
	/**
	 * constructor for WelcomeProxy class.
	 */
    
         private static WelcomeProxy instance;
    
	private WelcomeProxy() {
	}

	/* (non-Javadoc)
	 * @see ca.uwo.frontend.interfaces.FacadeCommands#placeOrder(java.util.Map, ca.uwo.client.Buyer)
	 */
	@Override
	public void placeOrder(Map<String, Integer> orderDetails, Buyer buyer) {
            LowQuantityProxy next = LowQuantityProxy.getInstance();
            next.placeOrder(orderDetails, buyer);
	}

	/* (non-Javadoc)
	 * @see ca.uwo.frontend.interfaces.FacadeCommands#restock(java.util.Map, ca.uwo.client.Supplier)
	 */
	@Override
	public void restock(Map<String, Integer> restockDetails, Supplier supplier) {
		SupplierProxy next = new SupplierProxy();
                next.restock(restockDetails, supplier);
	}
        
        public static WelcomeProxy getInstance(){
            if(instance == null)
                instance = new WelcomeProxy();
            return instance;
        }

}
