package javaDers3;

public class Main {

	public static void main(String[] args) {
		String mesaj= "Vade Oranı";
		Product product1 = new Product();//yeni bir product nesnesi
		
		//set - değer atama
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(3);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(10);
		product1.setImageUrl("bıdıbıdı.jpg");
		//get - okuma 
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		
		product2.setName("Fakir Kahve Makinesi");
		product2.setDiscount(2);
		product2.setUnitPrice(3500);
		product2.setUnitsInStock(12);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		
		product3.setName("Simbo Kahve Makinesi");
		product3.setDiscount(3);
		product3.setUnitPrice(5500);
		product3.setUnitsInStock(13);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1, product2, product3};
		//product türünde veri girmemiz lazım
		
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getDiscount());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getUnitsInStock());
			System.out.println(product.getImageUrl());
		}
		

	}

}
