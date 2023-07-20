package encapsulationKullanimi;

public class ProductManager {
	public void Yazdir(Product product) {
		System.out.println("***Ürün Özellikleri***");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getDescription());
		System.out.println(product.getPrice());
		System.out.println(product.getColor());
	}
}
