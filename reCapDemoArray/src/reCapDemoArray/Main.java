package reCapDemoArray;

public class Main {

	public static void main(String[] args) {
		
		double[] myList= {1.2, 3.2, 1.4,2.5};
		double total=0;
		
		for (double number: myList) {
			total= total+number;
			System.out.println(number);
		}
		
		System.out.println("Toplam: "+ total);
		
		

	}

}
