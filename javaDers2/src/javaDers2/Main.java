package javaDers2;

public class Main {

	public static void main(String[] args) {
		// Switch- Case
		
		char grade= 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("Geçtiniz.");
			break;
		case 'B':
		case 'C':
			System.out.println("Geçtiniz. eh");
			break;
		case 'D':
			System.out.println("Geçtiniz. fena değil.");
			break;
		case 'F':
			System.out.println("Kaldınız.");
			break;
		default:
				System.out.println("Geçersiz Giriş.");
				
			
		}
	}

}
