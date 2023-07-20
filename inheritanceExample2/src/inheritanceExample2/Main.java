package inheritanceExample2;

public class Main {

	public static void main(String[] args) {
		employee gamze= new employee();
		gamze.salary=10000;
		gamze.salaryCalculation();
		
		salesman ahmet = new salesman();
		
		ahmet.salary=5000;
		ahmet.satis=200;
		ahmet.salaryCalculator();
		
		engineer merve= new engineer();
		merve.salaryCalculator();
		}

}
