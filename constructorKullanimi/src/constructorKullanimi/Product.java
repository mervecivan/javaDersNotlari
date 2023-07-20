package constructorKullanimi;

public class Product {
	//bu yapıcı bloktur. sınıftan nesne üretildiğinde çalışır.
	public Product(String name, int id, int price) {
		System.out.println("Yapıcı Blok Çalıştı");
		this.id=id;
		this.name= name;
		this.price=price;
		//bu işlem set etme işlemidir.
	}
	private String name;
	private int id;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
