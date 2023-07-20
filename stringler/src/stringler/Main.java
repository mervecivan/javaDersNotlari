package stringler;

public class Main {

	public static void main(String[] args) {
		
		String metin="Bugün hava çoksel";
//		
//		System.out.println("Eleman sayısı: "+ metin.length());
//		System.out.println("Beşinci elleman: "+ metin.charAt(4));
//		System.out.println(metin.concat(" Yaşasın!"));
//		System.out.println(metin.startsWith("B"));
//		//b ile başlıyor mu?
//		System.out.println(metin.endsWith("!"));
//		//"!" ile bitiyor mu?
//		char[] karakterler = new char[5];
//		metin.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(metin.indexOf("a"));
//		System.out.println(metin.lastIndexOf("e"));
//		
		
		System.out.println(metin.replace("a", "o"));
		// a yerine o koymamızı sağladı
		
		System.out.println(metin.substring(5));
		//5. indeksten itibaren alır
		
		System.out.println(metin.substring(2, 4));
		// 2-4 arası indeksi alır
		
		for (String kelime: metin.split(" ")) {
			System.out.println(kelime);
		}
		//kelimeleri boşluktan itibaren ayırdı.
		
		System.out.println(metin.toLowerCase());
		
		System.out.println(metin.toUpperCase());
		
		System.out.println(metin.trim());
		//metnin başındaki ve sonundaki boşlukları atar
		
		

	}

}
