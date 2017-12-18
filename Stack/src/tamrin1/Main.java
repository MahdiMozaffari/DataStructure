//the name:mahdi_mozaffari
//the_collegian number:9511213529
package tamrin1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Stack stack = new Stack(6);

		System.out.println("Enter the ideal infix word,please:");
		String input = s.nextLine();
		char arry[] = input.toCharArray();

		int z = 0;
		while (z != 4) {

			System.out.println("push or pop or show ?!... for push,Enter 1 __ for pop, Enter 2 __ for show Enter 3");
			int add = s.nextInt();

			if (add == 1) {

				System.out.println("your infix push to first stack1 or 2 ?...");

				int number = s.nextInt();

				if (number == 1) { // push at first stack

					for (int i = 0; i < arry.length; i++) {
						stack.push1(arry[i]);
					}
					System.out.println("become push");

				}

				if (number == 2) { // push at end stack

					for (int i = 0; i < arry.length; i++) {
						stack.push2(arry[i]);
					}
					System.out.println("become push");
				}
			}
			if (add == 2) {

				System.out.println("want you pop?... from stack1 or 2 ?...");
				int number1 = s.nextInt();

				if (number1 == 1) { // pop from first stack
					stack.pop1();
					System.out.println("become pop");
				}
				if (number1 == 2) { // pop from end stack
					stack.pop2();
					System.out.println("become pop");
				}
			}
			if (add == 3) {
				System.out.println("want show stack for you ?..." + "if you want,Enter the number 100");
				int number3 = s.nextInt();
				if (number3 == 100)
					stack.print();

			}

		}

	}
}
