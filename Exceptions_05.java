import java.lang.Exception;
import java.util.Scanner;


class Test {

	public void suma(int n, Scanner scanner) throws NumberFormatException, ArrayIndexOutOfBoundsException{

		int values[] = new int[3];
		int s = 0;
		for(int i=0; i<n; i++){
			values[i] = Integer.parseInt(scanner.nextLine());
		}

		for(int i=0; i<n; i++){
			s += values[i];
		}

		System.out.println("Rezultatul adunarii: "+s);
	}

	public static void main(String... args){
		int n;
		Test tester = new Test();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cate valori adunam? ");
		n = Integer.parseInt(scanner.nextLine());
		
		try {
			tester.suma(n, scanner);
			
		} 
		catch (NumberFormatException e) {
			System.out.println("Valoare introdusa in format incorect...");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Prea multe valori pentru un sir prea mic...");
		} 
		finally {
			System.out.println("Finally va fi rulat oricum.");
                }
        }
}
