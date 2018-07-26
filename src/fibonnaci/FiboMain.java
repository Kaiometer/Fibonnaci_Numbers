package fibonnaci;

import java.util.Scanner;

public class FiboMain {
	public static void main(String[] args) {
		int Fib = 1;
		int Fib0 = 0;
		boolean want;
		System.out.println("Do want the next number?");
		Scanner keyboard = new Scanner(System.in);
		want = keyboard.nextBoolean();
		if(want == false) {
			System.out.print("Okay then");
		}
		if (want == true) {
			while (want == true) {
				int result = Fib;
				System.out.println(result);
				result = Fib+Fib0;
				Fib0 = Fib;
				Fib = result;
				
				System.out.println("Do you want the next number?");
				Scanner keyboard1 = new Scanner(System.in);
				
				
				
				want = keyboard1.nextBoolean();
				
	}
		}
	}
}
