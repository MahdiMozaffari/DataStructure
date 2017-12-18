//the name:mahdi_mozaffari   
//the_collegian number:9511213529
package List_2_tarafe_change;

public class LinkedList {

	public Node first = null;

	public void add(Student data)
	{
		Node n = new Node (data , null , null);
		
		/**Empty list*/
		if( first == null )
			first = n ;
		
		/**list with a Node */
		if( first.getNext() == first )
		{
			first.setNext(n);
			n.setPrev(first);
		}
		
		/**other state*/
		else
		{
			Node q = null ;
			Node p = first ;
			
			while( p.getNext() != null )
			{
				q = p ;
				p = p.getNext() ;
			}
			p.setNext(n);
			n.setPrev(p);
		}
	}
	
	  public void change()
	  {
		Node q = first.getPrev() ;
		Node p = first.getNext() ;
		
		q.getPrev().setNext(p) ;
		p.setPrev(q.getPrev());
		first.setPrev(p) ;
		first.setNext(q) ;
		q.setPrev(first) ;
		q.setNext(p.getNext()) ;
		p.setNext(first) ;
		p.getNext().setPrev(q);		
		
	  }
	  
	  public void showinfo() {
			Node p = first;
			while (p.getNext() != null) {
				System.out.println(p.getData().getCode() +" "+ p.getData().getName());
				p = p.getNext();
			}
			System.out.println(p.getData().getCode() +" "+ p.getData().getName());
		}
}
