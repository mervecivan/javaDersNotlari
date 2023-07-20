package miniProje2;

public class Main {

	public static void main(String[] args) {
	
	char harf = 'E';
	
	switch(harf) {
	case 'A':
	case 'E':
	case 'I':
	case 'İ':
	case 'O':
	case 'Ö':
	case 'U':
	case 'Ü':
		System.out.println("sesli");
		break;
	default:
		System.out.println("sessiz harf");
	}
		
	}

}
