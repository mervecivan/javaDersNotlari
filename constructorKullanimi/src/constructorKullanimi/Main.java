package constructorKullanimi;

public class Main {

	public static void main(String[] args) {
		Product product = new Product("laptop", 123, 5000);
		
		//değişkenlerin değerini yapıcı blok içerisinde verebilirz
		//yapıcı bloğa değişkenleri parametre olarak atar ve newlendiğinde değerlerini gireriz.
		//buna parametreli constructor denir.
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
	}

}
