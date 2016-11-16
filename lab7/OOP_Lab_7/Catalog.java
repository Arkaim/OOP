import  java.io.*;
import  java.util.*;

public class Catalog implements Iterable<Product>  {
	private ArrayList<Product> products;

	public Catalog() {
		products = new ArrayList<Product>();  
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public Iterator<Product> iterator () {
		return products.iterator();
	}

	public Product getProduct(String code) {   
        for (Iterator<Product> i = iterator(); i.hasNext();) {   
            Product product = i.next();   
            if (product.getCode().equals(code))   
                return product;   
        }   
        return null;   
    }   

    public int getNumberOfProducts() {
    	return this.products.size();
    }
}