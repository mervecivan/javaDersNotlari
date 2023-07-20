package metods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	//camelCase
	public static void sayiBulmaca() {
		int[] sayilar= new int[] {1,2,5,7,9};
		int aranacak=6;
		boolean varMi= false;
		
		for(int sayi: sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi== true){
		System.out.println("Sayı mevcuttur: "+aranacak);
	}
		else {
			System.out.println("Sayı mevcut değil: "+aranacak);
		}
		
	}
}