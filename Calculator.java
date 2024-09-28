public class Calculator{

	public static void main(String [] args){
		System.out.println("Calculator Program");
		/* int a = 12;
		int b = 13;
		int sum = a+b;
		int diff = a-b;
		int multiplication = a*b;
		double div = a/b;
		System.out.println("sum = "+sum);
		System.out.println("diff = "+diff);
		System.out.println("multiplication = "+multiplication);
		System.out.println("div = "+div); */
		
		/*int a = 12;
		int b = 13;
		add(a,b);
		diff(a,b);
		multiplication(a,b);
		division(a,b);*/
	
		/*int a = 12;
		int b = 13;
		CalCulationLogic.add(a,b);
		CalCulationLogic.diff(a,b);
		CalCulationLogic.multiplication(a,b);
		CalCulationLogic.division(a,b);*/

		CalCulationLogic.calculation('+');
	}

	private static void add(int a, int b){
		int sum = a+b;
		System.out.println("sum = "+sum);
	}

	private static void diff(int a, int b){
		int diff = a-b;
		System.out.println("diff = "+diff);
	}

	private static void multiplication(int a, int b){
		int multiplication = a*b;
		System.out.println("multiplication = "+multiplication);
	}

	private static void division(int a, int b){
		double division = a/b;
		System.out.println("division = "+division);
	}
}


/* Keywords - public , class , static, void , int double
//  Public - Access Specifier
    private
    default
    protected
static - */
