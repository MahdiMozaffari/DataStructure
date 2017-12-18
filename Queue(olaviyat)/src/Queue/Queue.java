//the name:mahdi_mozaffari
//the_collegian number:9511213529
package Queue;
import java.util.*;

public class Queue {
	
	int front;
	int rear;
	int size;
	int number;
	int[] arry;

	public Queue(int length) {

		arry = new int[length];
		size = length;
		front = 0;
		rear = 0;
		}

	public int getNumber() {
		return number;
	}

	public boolean isFull() {
		return number == size;
	}

	public boolean isEmpty() {
	return rear == front;
//		return number == 0;
	}

	public Object remove() {
		Object temp = 0;
		
		if (isEmpty())
			System.out.println("Queue isEmpty");

		else {
			
		}
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

					int temp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = temp;
				}
			}
		}
	}
	public void print() {

		for (int i = 0; i < arry.length; i++)
			System.out.println(arry[i]);
	}
}