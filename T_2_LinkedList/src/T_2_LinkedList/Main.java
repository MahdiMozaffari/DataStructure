//the name:mahdi_mozaffari
//the_collegian number:9511213529
package T_2_LinkedList;

import java.util.Scanner;

import T_2_LinkedList.Student;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
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

			/** addToMiddLing_methode */
			case 3:
				System.out.println("enter the student code,please :");
				int code3 = scan.nextInt();
				System.out.println("enter the student name,please :");
				String name3 = scan.next();
				System.out.println("enter the suitable space for Insert , please:");
				int input1 = scan.nextInt();

				Student student3 = new Student(code3, name3);

				list.addToMiddling(student3,input1);
				
				break;
				
			case 4:

				list.showinfo();
			}
		}
	}
}
