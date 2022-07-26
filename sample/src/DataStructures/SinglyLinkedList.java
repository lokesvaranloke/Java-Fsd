package DataStructures;

public class SinglyLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void insert(int value) {
		Node newnode=new Node(value);
		newnode.next=null;
		if(head==null) {
			head=newnode;
			return;
		}
		Node n=head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=newnode;
		return;
	}
	public void delete(int k) {
		Node current=head;
		Node temp=null;
		while(current!=null && current.data!=k) {
			temp=current;
			current=current.next;
		}
		temp.next=current.next;
	}
	public void print() {
		Node n=head;
		while(n!=null) {
			System.out.print(" "+n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		System.out.println("The Linked List:");
		list.print();
		System.out.println();
		list.delete(4);
		System.out.println("The Linked list after deleting key 4:");
		list.print();
		System.out.println();
		list.delete(5);
		System.out.println("The Linked list after deleting key 5:");
		list.print();
		
	}

}
