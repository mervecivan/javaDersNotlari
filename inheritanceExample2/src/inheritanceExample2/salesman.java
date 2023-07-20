package inheritanceExample2;

public class salesman extends employee{
int satis;
	
	void salaryCalculator(){
		int newSalary= salary + (satis*5)/100;
		System.out.println(newSalary);
	}
}
