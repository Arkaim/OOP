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
           String result = "<html>"   
                    + System.lineSeparator()   
                    + "  <body>"   
                    + System.lineSeparator()    
                    + "    <center><h2>Orders</h2></center>"   
                    + System.lineSeparator();   
        	for (Order order :sales) {             
            result += "    <hr>"   
                + System.lineSeparator()   
                + "    <h4>"   
                + "Total = " + order.getTotalCost() + "</h4>" + System.lineSeparator();   
                           
            for (OrderItem item : order) {   
                result += "     <p>" + System.lineSeparator() + "      <b>code:</b>"    
                    + item.getProduct().getCode() + "<br>" + System.lineSeparator();   
                result += "      <b>quantity:</b>" + item.getQuantity()   
                    + "<br>" + System.lineSeparator();   
                result += "      <b>price:</b>" + item.getProduct().getPrice()    
                    + "<br>" + System.lineSeparator() + "     </p>" + System.lineSeparator();                                  
            }              
        }   
        result += "  </body>" + System.lineSeparator() + "</html>" ;   
        return result;   
    	}   


}
