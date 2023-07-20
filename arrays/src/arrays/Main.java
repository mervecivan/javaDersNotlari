package arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] students = {"Merve, Furkan, Melike, Betül, Yiğit, Gamze"};
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		String[] esyalar = new String[3];
		
		esyalar[0]="Koltuk";
		esyalar[1]="Televizyon";
		esyalar[2]="Yatak";
		
		for (String a : esyalar) {
			System.out.println(a);
		}

	}

}
