//the name:mahdi_mozaffari 
//the_collegian number:9511213529
package List_2_tarafe_delete;

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
	
	
	  public void Delete(Student data , int Item)
	  {
		  Node p = first ;
		  
		  while( p != null && p.getData().getCode() != Item )
			  p = p.getNext() ;
		  
		  if( p == null )
		  {
			  p = first.getPrev() ;
			  while( p != null && p.getData().getCode() != Item )
				  p = p.getPrev() ;
		  }
		  
		  if( p == null )
			  System.out.println("Not found ideal your Item !");
		  
		  if( p.getData().getCode() == Item)
		  {
			  if( p.getPrev() == null)
			  {
				  p.getNext().setPrev(null) ;
				  first = p.getNext() ;
			  }
			  else if( p.getNext() == null )
			  {
				  p.getPrev().setNext(null) ;
				  first = p.getPrev() ;
			  }
			  else
			  {
				  p.getPrev().setNext(p.getNext());
				  p.getNext().setPrev(p.getPrev());
			  }
		  }
	 }
	
	public void showinfo() {
		Node p = first;
		while (p.getNext() != null) {
			System.out.println(p.getData().getCode() + " " + p.getData().getName());
			p = p.getNext();
		}
		System.out.println(p.getData().getCode() + " " + p.getData().getName());
	}
}