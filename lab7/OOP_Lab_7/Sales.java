import  java.io.*;
import  java.util.*;

public class Sales implements Iterable<Order>  {
	private ArrayList<Order> orders;

	public Sales() {
		orders = new ArrayList<Order>();
	}

	public void addOrder (Order order) {
		orders.add(order);
	}

    public Iterator<Order> iterator() {     
        return orders.iterator();   
    }   

	public int getNumberOfOrders () {
		return orders.size();
	}


}