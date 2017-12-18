//the name : mahdi_mozaffari    
//the_collegian number : 9511213529
package List_charkheshi_b ;

public class LinkedList {

	public Node first = null;

	public void add(Student stu)
	{
		Node n = new Node( stu , null);
		
		/**Empty list*/
		if( first == null )
		{
		first = n;
		n.setNext(first);
		}
		
		/**list with a Node*/
		if( first.getNext() == first )
		{
			first.setNext(n);
			n.setNext(first);
		}
		
		/**other state*/
		else
		{
			Node p =first ;
			while(p.getNext() != first)
			{
				p = p.getNext() ; 
			}
			p.setNext(n);
			n.setNext(first);
		}
	}

	public void showinfo() {

		if (first == null)
			System.out.println("the ideal your list,isEmpty !!");

		else {
			Node p = first;
			while (p.getNext() != first) {

				System.out.println(p.getStu().getName() +" "+ p.getStu().getCode());
				
				p = p.getNext();
			}
			System.out.println(p.getStu().getName() +" " + p.getStu().getCode());
		}
	}
}
