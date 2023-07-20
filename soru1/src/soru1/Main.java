package soru1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String password="12345";
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Şifreyi girin: ");
		String sifre= scr.next();
		
		// burada equals metodunu kullanmalıyız çünkü string ifadeleri 
		//karşılaştırırken == operatörü işe yaramaz
		
		if(sifre.equals(password)) {
			System.out.println("Giriş Başarılı.");
		}
		else {
			System.out.println("Giriş Başarısız.");
		}
	}

}
