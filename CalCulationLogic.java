public class CalCulationLogic{

	public void add(int a, int b){
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

	public static void calculation(char operator){
		switch(operator) {
			case '+':
			System.out.println("sum = ");
			break;
			case '-':
			System.out.println("diff = ");
			break;
			case '*':
			System.out.println("Mul = ");
			break;
			case '/':
			System.out.println("Division = ");
			break;
			default:
			System.out.println("Wrong operator = "+operator);

		}
	}
}