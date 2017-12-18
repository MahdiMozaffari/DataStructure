//the name : mahdi_mozaffari   
//the_collegian number : 9511213529
package List_charkheshi_c;

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
	
	
	/**change place Node before first with Node after first_method*/
	public void change(){
		
		Node q = null;
		Node p = first;
		Node a = first.getNext() ;
		
		while( p.getNext() != first )
		{
			q = p ;
			p = p.getNext() ;
		}

		p.setNext(a.getNext());	
		first.setNext(p);
		q.setNext(a);
		a.setNext(first);
		
	}
	
	public void showinfo() {
		Node p = first;
		while( p.getNext() != first )
		{
			System.out.println(p.getStu().getCode() + " " + p.getStu().getName());
			p = p.getNext();
		}
		System.out.println(p.getStu().getCode() + " " + p.getStu().getName());
	}

}
