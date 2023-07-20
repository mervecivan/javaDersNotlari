package javaDers1;

public class Main {
	
	//main javada başlangıç noktasıdır
	public static void main(String[] args) {
		int s1=20, s2=25, s3=2;
		int enBuyuk= s1;
		
		if(enBuyuk < s2) {
			enBuyuk=s2;
		}
		else if(enBuyuk< s3) {
			enBuyuk=s3;
		}
		
		System.out.println("En Büyük: "+ enBuyuk); 
		
		

	}

}
