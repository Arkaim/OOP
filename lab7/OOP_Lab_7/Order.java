import  java.io.*;
import  java.util.*;

public class Order implements Iterable<OrderItem>  {
	private ArrayList<OrderItem> items;

	public Order() {
		items = new ArrayList<OrderItem>();  
	}

	public void addItem(OrderItem orderItem){
		items.add(orderItem);
	} 

	public void removeItem(OrderItem orderItem) {   

        Iterator<OrderItem> i = items.iterator();
        while (i.hasNext()) {   
            if (i.next().equals(orderItem)) {   
                i.remove();   
            }   
        }   
    }  

	public Iterator<OrderItem> iterator() {
		return items.iterator();
	}

	public OrderItem getItem(Product product) {        
		
        for (Iterator<OrderItem> i = items.iterator(); i.hasNext();) {   
            OrderItem item = i.next();   
            if (item.getProduct().equals(product))   
                return item;   
        }   
        return null;   
    }   

    public int getNumberOfItems() {
    	return items.size();
    }

    public double getTotalCost() {       
        double totalCost = 0;    
        for (Iterator<OrderItem> i = items.iterator(); i.hasNext();) {   
            totalCost += i.next().getValue();   
        }   
        return totalCost;   
    }
}