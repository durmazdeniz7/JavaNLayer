package nLayeredDemo;

import nLayeredDemo.bussines.abstracts.ProductService;
import nLayeredDemo.bussines.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAcces.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		ProductService productService=new ProductManager(new AbcProductDao(),new  jLoggerManagerAdapter());
		
		Product product=new Product(1,2,"Elma ",12,50); 
		
		
		productService.add(product);
		

	}

}
