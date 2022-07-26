package LinkedList;

public class singlyLinkedList {
	
	node head;
	
	public class node{
		int data;
		node next;
	}
	public void insert(int data) {
		node node = new node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		} else {
			node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public void delete(int k) {
		node current = head;
		node temp = null;
		if(current.data==k) {
			head=current.next;
			current=null;
		} else {
			while(current!=null && current.data!=k) {
				temp=current;
				current=current.next;
			}
			temp.next=current.next;
			current=null;
		}
	}
	public void show() {
		
		node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		
		singlyLinkedList sl = new singlyLinkedList();
		sl.insert(1);
		sl.insert(2);
		sl.insert(3);
		sl.insert(4);
		sl.insert(5);
		sl.insert(6);
		sl.insert(7);
		sl.insert(8);
		sl.show();
		sl.delete(1);
		System.out.println();
		sl.show();
		sl.delete(4);
		System.out.println();
		sl.show();
		sl.delete(8);
		System.out.println();
		sl.show();
	}
}
