//the name:mahdi_mozaffarri 
//the_collegian number:9511213529
package linkedlist5;

public class Node {

	private Student stu;
	private Node next;
	
	public Node( Student stu , Node next ){
		
		this.stu = stu;
		this.next = next;
	}
	
	public Student getStu(){
		return stu;
	}
	
	public void setStu(Student stu){
		this.stu = stu;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	
}
