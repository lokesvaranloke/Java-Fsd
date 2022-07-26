package queue;

public class queue {
	
	int[] queue = new int[5];
	int size;
	int front;
	int rear;
	
	public void enq(int data) {
		queue[rear]=data;
		System.out.println(queue[rear]+" is added in queue");
		rear=(rear+1)%5;
		size=size+1;
	}
	
	public void deq(){
		System.out.println(queue[front]+" is deleted");
		front=(front+1)%5;
		size=size-1;
		}
	
	
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		queue q = new queue();
		q.enq(10);
		q.enq(20);
		q.enq(30);
		q.enq(40);
		q.show();
		System.out.println();
		q.deq();
		q.deq();
		q.show();
		System.out.println();
		q.enq(50);
		q.enq(60);
		q.enq(70);
		q.show();
		System.out.println();
	}
}
