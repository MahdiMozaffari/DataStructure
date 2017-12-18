//the name:mahdi_mozaffari    
//the_collegian number:9511213529
package T_1_LinkedList;

public class LinkedList {

	public Node first = null;

	public void addToEnd(Object stu) {

		Node n = new Node(stu, null);

		if (first == null) {
			first = n;
		}

		else {
			Node p = first;
			while (p.getNext() != null)
				p = p.getNext();
			p.setNext(n);
		}
	}

	public void showinfo(Node n) {
		
		
		if (n.getNext() == null) {
			System.out.println(n.getStu());
			return;
		}
		showinfo(n.getNext());
		System.out.println(n.getStu());

	}
}
