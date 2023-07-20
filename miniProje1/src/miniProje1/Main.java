package miniProje1;

public class Main {

	public static void main(String[] args) {
		int number= 25;
		boolean asalMi= true;
		
		for (int i=2; i<number; i++) {
			if(number % i == 0) {
				asalMi=false;
			}
		}
		
		System.out.println("Asallık durumu: "+ asalMi);
		
	}

}
