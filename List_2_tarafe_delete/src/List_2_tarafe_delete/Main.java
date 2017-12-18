//the name:mahdi_mozaffari   
//the_collegian number:9511213529
package List_2_tarafe_delete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 LinkedList list = new  LinkedList();
		while (true) {
			Student.main();
			Scanner scan = new Scanner(System.in);
			int userinput = scan.nextInt();
			switch (userinput) {
			
			/** Add_methode */
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
				
			/** Delete_methode */
			case 2:
				
				System.out.println("enter the ideal element for remove:");
				int element = scan.nextInt();
				Student student4 = new Student( 0, null);
				list.Delete(student4 , element );
				
				break;
		
				/**Show method*/
			case 3:

				list.showinfo();
				
				break ;
			}
		}
	}
}
