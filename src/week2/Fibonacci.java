package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		
		println("This program will list the Fibbonacci sequence.");
		
		int Fib1 = 0;
		
		int Fib2 = 1;
		
		while (Fib1 <= 10000) {
			
			println(Fib1);
			
			int Fib3 = Fib1 + Fib2;
			
			Fib1 = Fib2;
			
			Fib2 = Fib3;
		}
	}
}
