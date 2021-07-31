package matrix;

import java.util.Scanner;

public class MultiplicationMatrix {

	public static void main(String[] args) {

		multiplicationMatrix();
		
	}

	public static void multiplicationMatrix () {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a number:");
		int range = scanner.nextInt();
		
		for(int i=1; i<=range; i++) {
			
			System.out.print(i + "\t");
			
			for(int x=2; x<=range; x++) {
				
				System.out.print(i*x + "\t");
				
				if(x==range) {
					System.out.println();
				}
			}
		}
	}
}
