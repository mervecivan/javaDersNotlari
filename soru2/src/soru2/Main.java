package soru2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int result;
		
		System.out.println("Programa Hoşgeldiniz...");
		System.out.println("Yapmak istediğiniz işlemin sembolünü girin(+, -, x, /): ");
		
		Scanner scan= new Scanner(System.in);
		
		String islem= scan.next();
		
		System.out.println("1.Sayıyı girin: ");
		int sayi1= scan.nextInt();
		
		System.out.println("2.Sayıyı girin: ");
		int sayi2=scan.nextInt();
		
		if(islem.equals("+")) {
			result= topla(sayi1, sayi2);
			System.out.println(result);
		}
		else if(islem.equals("-")) {
			result= cikar(sayi1, sayi2);
			System.out.println(result);
		}
		else if(islem.equals("x")) {
			result= carp(sayi1, sayi2);
			System.out.println(result);
		}
		else {
			result= bol(sayi1,sayi2);
			System.out.println(result);
		}
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+ sayi2;
	}
	
	public static int cikar(int sayi1, int sayi2) {
		return sayi1-sayi2;
	}
	
	public static int carp(int sayi1, int sayi2) {
		return sayi1* sayi2;
	}
	
	public static int bol(int sayi1, int sayi2) {
		return sayi1/sayi2;
	}

}
