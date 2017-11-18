import java.lang.Exception;
import java.util.Scanner;

class ResultTooLargeException extends Exception {
	ResultTooLargeException(String msg){
		super(msg);
	}
}

class Test {

	public void test(int result) throws ResultTooLargeException{
		if (result > 5){
			throw new ResultTooLargeException("Rezultatul adunarii: "+result + " este prea mare...");
		}
		System.out.println("Rezultatul adunarii: "+result);
	}

	public static void main(String... args){
		int a, b;
		Test tester = new Test();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduceti doua valori intregi: ");
		a = scanner.nextInt();
		b = scanner.nextInt();

		int result = a + b;
		
		try {
			tester.test(result);
			
		} catch (ResultTooLargeException e) {
			System.out.println("Exceptie prinsa.");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally va fi rulat oricum.");
                }
        }
}
