package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao{
	public void Add(Product product) {
		//sadece database erişim kodları buraya yazılır -SQL
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
