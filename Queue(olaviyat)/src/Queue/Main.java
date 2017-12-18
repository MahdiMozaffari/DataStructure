//the name:mahdi_mozaffari
//the_collegian number:9511213529
package Queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Queue queue1 = new Queue(5);
		Queue queue2 = new Queue(5);
		Queue queue3 = new Queue(5);

		int z = 0;
		while (z != 4) {

			System.out.println("Insert or remove or show?...for Insert,Enter 1__for remove,Enter 2__for show,Enter 3...");
			int mere = s.nextInt();

			if (mere == 1) {			//Insert
				
				System.out.println("you select insert option..");
				System.out.println("Enter the ideal number,please:");
				int input = s.nextInt();
				System.out.println("Insert by Queue preference 1 or 2 or 3 ?!...");
				int number = s.nextInt();
				
				if (number == 1){
					queue1.insert(input);
					System.out.println("done by success!!");}
			
				if (number == 2){
					queue2.insert(input);
					System.out.println("done by success!!");}
				
				if (number == 3){
					queue3.insert(input);
					System.out.println("done by success!!");}
			}
			
			if(mere == 2){				//Remove
				
				System.out.println("You select remove option..");
				System.out.println("Remove by Queue preference 1 or 2 or 3 ?!...");
				int input1 = s.nextInt();
				
				if(input1 == 1){
					queue1.remove();
					System.out.println("done by success.");}
					
				
				if(input1 == 2){
					queue2.remove();
					System.out.println("done by success.");}
				
				if(input1 == 3){
					queue3.remove();
					System.out.println("done by success.");}
			}
			
			if(mere == 3){			//Show
				
				System.out.println("You select show option..");
				System.out.println("Show by Queue preference 1 or 2 or 3 ?!...");
				int input2 = s.nextInt();
				
				if(input2 == 1){
					System.out.println("show Queue 1:");
					queue1.print();}
				
				if(input2 == 2){
					System.out.println("show Queue 2:");
					queue2.print();}
				
				if(input2 == 3){
					System.out.println("show queue 3:");
					queue3.print();}
			}
		}
	}

}
