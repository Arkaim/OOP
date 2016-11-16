import java.util.*;

public class PlainTextSalesFormatter implements SalesFormatter{
	static private SalesFormatter singletonInstance = null;

	public static PlainTextSalesFormatter getSingletonInstance() {
		i f (singletonInstance) == null {
			singletonInstance = new PlainTextSalesFormatter;
		}
		return singletonInstance;
	}

	private PlainTextSalesFormatter() {

	}

	public String formatSales(Sales sales) {   
   
	        int k = 0;   
	        String result = "";   
	   
	        for (Iterator<Order> i = sales.iterator(); i.hasNext();) {   
	            Order order = i.next();   
	            k++;   
	            result += "\n------------------------\nOrder " + k + "\n\n";   
	            for (Iterator<OrderItem> j = order.iterator(); j.hasNext();) {   
	                OrderItem orderItem = j.next();   
	                result += orderItem.getQuantity() + " "   
	                        + orderItem.getProduct().getCode() + " "   
	                        + orderItem.getProduct().getPrice() + "\n";   
	            }   
	            result += "\nTotal = " + order.getTotalCost();   
	        }   
	   
	        return result;   
	 }   
}