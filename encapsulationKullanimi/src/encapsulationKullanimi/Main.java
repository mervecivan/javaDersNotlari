package encapsulationKullanimi;

public class Main {

	public static void main(String[] args) {
		Product product= new Product();
		
		product.setId(11111111);
		product.setName("Laptop");
		product.setDescription("Lenovo");
		product.setPrice(5000);
		product.setColor("Black");
		
		ProductManager productManager= new ProductManager();
		
		productManager.Yazdir(product);
	}

}
