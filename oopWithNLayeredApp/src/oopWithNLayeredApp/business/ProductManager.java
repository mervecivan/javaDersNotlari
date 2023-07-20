package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}


	public void Add(Product product) throws Exception {
		//iş kuralları
		if(product.getUnitPrice()<10) { //product'ın girilen fiyatı
			throw new Exception("Ürün fiyatı 10dan küçük olamaz.");
			//hata fırlatma
		}
				
		productDao.Add(product);
		
		//bir katman başka bir katmanın classını kullanıyorken
		//sadece interface'inden erişim kurmalıdır.
	}
}
