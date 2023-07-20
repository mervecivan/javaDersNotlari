package soru3;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[100];
		
		Random rnd= new Random();
		
		for (int i=0; i<=100; i++) {
			int sayi= rnd.nextInt(101);
			sayilar[i]= sayi;
			}
		
		System.out.println(sayilar[0]);
		System.out.println(sayilar[1]);
		System.out.println(sayilar[2]);
		System.out.println(sayilar[3]);
	}

}
