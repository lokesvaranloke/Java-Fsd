package stackop;

public class stack {
	
	int size=5;
	int top=-1;
	int[] a = new int[size];

	public static void main(String[] args) {
		
		stack s = new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		s.push(50);
		s.pop();
		s.push(60);
	}
	
	void push(int ele) {
		
		if(top>=(size-1)) {
			System.out.println("Stack is full");
		} else {
			top++;
			a[top]=ele;
			System.out.println(ele+" is pushed into stack");
		}
		
	}
	
	void pop() {
		
		if(a[top]==-1) {
			System.out.println("Stack is empty");
		} else {
			int ele = a[top];
			top--;
			System.out.println(ele+ " is poped from stack");
		}
	}
}
