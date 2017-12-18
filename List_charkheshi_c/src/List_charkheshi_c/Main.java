//the name: mahdi_mozaffari   
//the_collegian number : 9511213529
package List_charkheshi_c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 LinkedList list = new  LinkedList();
		 
		while (true) {
			Student.main();
			Scanner scan = new Scanner(System.in);
			int userinput = scan.nextInt();
			
			switch (userinput) {
			/** add_methode */
			case 1:

				System.out.println("enter the student code,please :");
				int code = scan.nextInt();
				System.out.println("enter the student name,please :");
				String name = scan.next();

				Student student = new Student(code, name);
				student.getCode();
				list.add(student);
				System.out.println("student added successfully");
				System.out.println(" the student code is :" + student.getCode());

				break;	
				
				/**change_methode*/
			case 2:
				
				list.change();
				System.out.println("Done");
				break;
				
			/**show_methode*/
			case 3:

				list.showinfo();
				break ;
			}
		}
	}
	
}
