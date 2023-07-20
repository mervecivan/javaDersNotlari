package variableArguments;

public class Main {

	public static void main(String[] args) {
		//metoda istediğimiz kadar parametre girmeyi sağlayalım
		int result= topla(12,3,45,5767);
		System.out.println(result);
		
	}
	// 3 nokta int array göndermişiz gibi çalışır.
	public static int topla(int... sayilar) {
		int toplam=0;
		
		for (int sayi: sayilar) {
			toplam +=sayi;
		}
		return toplam;
	}

}
