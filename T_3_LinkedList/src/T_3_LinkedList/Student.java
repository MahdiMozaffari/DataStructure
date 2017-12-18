//the name:mahdi_mozaffari 
//the_collegian number:9511213529
package T_3_LinkedList;

public class Student {

	int code;
	String name;

	public Student(int code, String name) {

		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("Your code is :" + this.getCode());
		System.out.println("Your name is :" + this.getName());
	}

	public static void main() {

		System.out.println("You select number one of under option,please :");
		System.out.println("1-add student to End  ");
		System.out.println("2-add student to First ");
		System.out.println("3-add student to Middling ");
		System.out.println("4-delete student from list ");
		System.out.println("5-print all student");
	}
}
