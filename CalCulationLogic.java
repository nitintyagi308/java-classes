import java.util.Scanner;

public class CalCulationLogic{

	public static void add(int a, int b){
		int sum = a+b;
		System.out.println("sum = "+sum);
	}

	static void diff(int a, int b){
		int diff = a-b;
		System.out.println("diff = "+diff);
	}

	protected static void multiplication(int a, int b){
		int multiplication = a*b;
		System.out.println("multiplication = "+multiplication);
	}

	static void division(int a, int b){
		double division = a/b;
		System.out.println("division = "+division);
	}

	public static void calculation(char operator,int a , int b){

		switch(operator) {
			case '+':
				add(a,b);
			break;
			case '-':
				diff(a,b);
			break;
			case '*':
			    multiplication(a,b);
			break;
			case '/':
			    division(a,b);
			break;
			default:
			System.out.println("Wrong operator = "+operator);

		}
	}
}