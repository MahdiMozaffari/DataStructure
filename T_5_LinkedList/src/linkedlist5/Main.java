//the name:mahdi_mozaffari  
//the_collegian number:9511213529
package linkedlist5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Linkedlist list = new Linkedlist();
		while (true) {
			Student.main();
			Scanner scan = new Scanner(System.in);
			int userinput = scan.nextInt();
			switch (userinput) {
			/** addTolast_methode */
			case 1:

				System.out.println("enter the student code,please :");
				int code = scan.nextInt();
				System.out.println("enter the student name,please :");
				String name = scan.next();

				Student student = new Student(code, name);
				student.getCode();
				list.addToEnd(student);
				System.out.println("student added successfully");
				System.out.println(" the student code is :" + student.getCode());

				break;
			/** addToFirst_methode */
			case 2:
				System.out.println("enter the student code,please :");
				int code2 = scan.nextInt();
				System.out.println("enter the student name,please :");
				String name2 = scan.next();

				Student student2 = new Student(code2, name2);

				list.addToFirst(student2);

				break;
			/** delete_methode */
			case 3:
				System.out.println("enter the student name,please :");
				Scanner scanname = new Scanner(System.in);
				String inputname1 = scanname.next();
				Student student3 = new Student(0, inputname1);
				list.delete(student3);
				break;

			case 4:

				list.showinfo();

			}

		}

	}

}
