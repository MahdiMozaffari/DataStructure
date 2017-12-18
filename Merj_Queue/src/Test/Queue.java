//the name:mahdi_mozaffari	 
//the_collegian number:9511213529
package Test;

import java.util.*;

public class Queue {

	private int front;
	private int rear;
	private int length;
	private	int[] arry;

	public Queue(int size) {

		arry = new int[size];
		length = size;
		front = 0;
		rear = 0;
	}
	
	public int getPeek() {
		if(isEmpty())
			System.out.println("Queue isFull!!");
		return arry[front];
	}
	public int getFront(){
		return front;
	}
	public int getRear(){
		return rear;
		
	}
	public int getLength(){
		return length;
	}

	public boolean isFull()
	{
		return rear == length;
	}
	
	public boolean isEmpty()
	{
		return rear == front;
			
	}

	public int remove() {

		if (isEmpty())
			System.out.println("Queue isEmpty");

		return arry[front++];
			
		
	}

	public void insert(int item) {

		if (isFull())
			System.out.println("Queue isFull");
		else {
			arry[rear] = item;
			rear++;
		}
	}

	public void sort() {

		for (int i = 0; i < arry.length - 1; i++) {

			for (int j = 0; j < arry.length - 1 - i; j++) {

				if (arry[j] > arry[j + 1]) {

					int temp =  arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = temp;
				}
			}
		}
	}

	public void print() 
	{
		for (int i = 0; i < arry.length; i++)
			System.out.print(arry[i] + " ");

	}

}
