//the name:mahdi_mozaffari 
//the_collegian number:9511213529
package Test;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the queue length 1,please :");
		int input1 = s.nextInt();
		Queue queue1 = new Queue(input1);
		int[] arry1 = new int[input1];
		

		System.out.println("Enetr the queue length 2, please :");
		int input2 = s.nextInt();
		Queue queue2 = new Queue(input2);
		int[] arry2 = new int[input2];
		

		Queue queue3 = new Queue(queue1.getLength() + queue2.getLength());
		int[] arry3 = new int[queue1.getLength() + queue2.getLength()];
		

		System.out.println("Enter elements for queue1,please:");
		for (int i = 0; i < queue1.getLength(); i++) {
			arry1[i] = s.nextInt();
			queue1.insert(arry1[i]);

		}
		System.out.println("Enter elements for arry2,please:");
		for (int j = 0; j < queue2.getLength();j++) {
			arry2[j] = s.nextInt();
			queue2.insert(arry2[j]);

		}

		queue1.sort();
		queue2.sort();
		System.out.println("show arry 1:");
		queue1.print();
		System.out.println("show arry 2:");
		queue2.print();

		while (queue1.getFront() < queue1.getLength() && queue2.getFront() < queue2.getLength() ) {

			if (queue1.getPeek() < queue2.getPeek())
				queue3.insert(queue1.remove());
			else
				queue3.insert(queue2.remove());

		}

		if (queue1.getFront() < queue1.getLength())
			
			while (queue1.getFront() < queue1.getLength())
			
				queue3.insert(queue1.remove());
		
		if (queue2.getFront() < queue2.getLength())
		
			while (queue1.getFront() < queue1.getLength())
			
				queue3.insert(queue2.remove());

		System.out.println("Show queue3:");
		queue3.print();

	}
}
