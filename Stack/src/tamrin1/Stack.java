//the name:mahdi_mozaffari
//the_collegian number:9511213529
package tamrin1;

public class Stack {

	int size;
	int top1;
	int top2; 
	Object[] arry;

	public Stack(int length) {
		arry = new Object[length];
		size = length;
		 top1 = -1;
		 top2 = size;
	}

	public boolean isEmpty(){
		return top1 == -1 || top2 == size;
	}

	public boolean isFull() {
		return top2 == top1 + 1;
	}

	public void push1(Object n) {
		if (isFull())
			System.out.println("stack1 isFull");
		else {
			++top1;
			arry[top1] = n;
		}
	}

	public void push2(char n) {
		if (isFull())
			System.out.println("stack2 isFull");
		else {
			--top2;
			arry[top2] = n;
		}
	}

	public Object pop1() {
		if (isEmpty())
			System.out.println("stack1 isEmpty");
		else {
			Object temp;
			temp = arry[top1];
			top1--;
			return temp;
		}return null;
	}

	public Object pop2() {
		if (isEmpty())
			System.out.println("stack2 isEmpty");
		else {
			Object temp;
			temp = arry[top2];
			top2++;
			return temp;
		}return null;
	}

	public void print() {
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}

}

