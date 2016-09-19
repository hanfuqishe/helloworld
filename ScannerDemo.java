import java.util.Scanner;

public class ScannerDemo {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("next() to receive: ");

		while (scan.hasNext()) {
			if (scan.hasNextInt() )
				System.out.println("Int: " + scan.nextInt());
			else{
				String str1 = scan.next();
				System.out.println("Input data are: " + str1);
				return;
			}
		}
	}
}
