//the name:mahdi_mozaffari 
//the_collegian number:9511213529
package List_2_tarafe_delete;

public class Node {

	private Student data;
	private Node next;
	private Node prev;

	public Node(Student data, Node next, Node prev) {

		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
