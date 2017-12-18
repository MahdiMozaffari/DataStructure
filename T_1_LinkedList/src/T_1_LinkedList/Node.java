//the name:mahdi_mozaffari 
//the_collegian number:9511213529
package T_1_LinkedList;

public class Node {

	private Object stu;
	private Node next;

	public Node(Object stu, Node next) {

		this.stu = stu;
		this.next = next;
	}

	public Object getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
