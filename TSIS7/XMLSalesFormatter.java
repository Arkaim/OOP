public class XMLSalesFormatter implements SalesFormatter {
	static private SalesFormatter singletonInstance = null;

	public static XMLSalesFormatter getSingletonInstance() {
		i f (singletonInstance) == null {
			singletonInstance = new XMLSalesFormatter;
		}
		return singletonInstance;
	}

	private XMLSalesFormatter() {

	}

	public String formatSales(Sales sales) {   
           
	        String out = "<Sales> ";   
	           
	        for (Order order :sales){              
	            out += System.lineSeparator()  + "<Order total = \"" + order.getTotalCost() + "\">";                         
	                           
	            for (OrderItem item : order){   
	                out += System.lineSeparator()  + "  <OrderItem quantity=\"" + item.getQuantity()   
	                             + "\" price=\"" + item.getProduct().getPrice() + "\">";   
	                out += item.getProduct().getCode() + "</OrderItem>";   
	            }   
	            out += System.lineSeparator()  +"  </Order>";   
	        }   
	        out += System.lineSeparator()  + "</Sales>";    
	        return out;   
	} 
}