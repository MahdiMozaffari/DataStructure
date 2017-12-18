//the name:mahdi_mozaffari
//the_collegian number:9511213529
package T_2_LinkedList;

public class LinkedList {

	public Node first = null;

	public void addToFirst(Student stu) {

		Node n = new Node(stu, null);

		if (first == null)
			first = n;

		else {
			n.setNext(first);
			first = n;
		}
	}

	public void addToEnd(Student stu) {

		Node n = new Node(stu, null);

		if (first == null)
			first = n;

		else {
			
			Node p = first;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(n);
		}
	}

	public void addToMiddling(Student stu, int k) {

		int count = 0;
		Node n = new Node(stu, null);
		Node q = null;
		Node p = first;
		if (/**first != null &&*/ k == 0) {
			n.setNext(first);
			p = n;
		}
		else {
			while (p != null && count < k) {
				q = p;
				p = p.getNext();
				count++;
			}
				q.setNext(n);
				n.setNext(p);
			}
		}
	
	public void showinfo() {
		Node p = first;
		while (p != null) {
			System.out.println(p.getStu().getCode() + " " + p.getStu().getName());
			p = p.getNext();
		}
	}
}
