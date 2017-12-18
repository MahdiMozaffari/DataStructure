//the name:mahdi_mozaffari 
//the_collegian number:9511213529
package linkedlist5;

public class Linkedlist {

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
			while (p.getNext() != null)
				p = p.getNext();
			p.setNext(n);
		}
	}
	
	
	public void addToMiddling(Student stu){
		
		Node n = new Node(stu,null);
		Node q = null;
		Node p = first;
		while( p!=null && stu.equals(p.getStu())){
			q.setNext(n);
			n.setNext(p);
		}
	}
	
	public void delete(Student stu) {

		if (first != null && stu.equals(first.getStu())) {
			first = first.getNext();
			System.out.println("done");
		}

		Node p = first;

		Node q = null;
		while (p != null && !stu.equals(p.getStu())) {
			q = p;
			p = p.getNext();
		}
		if (p != null) {

			q.setNext(p.getNext());

		}

	}
	
	public void showinfo() {
		Node p = first;
		while (p != null) {
			System.out.println(p.getStu().getCode() + " " + p.getStu().getName());
			p = p.getNext();
			p = p.getNext();
		}
	}
}
