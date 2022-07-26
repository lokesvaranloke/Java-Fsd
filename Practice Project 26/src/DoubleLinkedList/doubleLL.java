package DoubleLinkedList;

public class doubleLL {

	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	public void after(Node prev_Node, int data){
		if (prev_Node == null) {
			System.out.println("previous node cannot be NULL ");
			return;
		}
		Node node = new Node(data);
		node.next = prev_Node.next;
		prev_Node.next = node;
		node.prev = prev_Node;
		if (node.next != null) {
			node.next.prev = node;
		}
	}

	void append(int data) {
		Node node = new Node(data);
		Node last = head;
		node.next = null;
		if (head == null) {
			node.prev = null;
			head = node;
			return;
		}
		while (last.next != null) {
			last = last.next;
		}
		last.next = node;
		node.prev = last;
	}

	public void show(Node n) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (n != null) {
			System.out.print(n.data + " ");
			last = n;
			n = n.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		doubleLL d = new doubleLL();
		d.append(6);
		d.push(7);
		d.push(1);
		d.append(4);
		d.after(d.head.next, 8);
		d.show(d.head);
	}
}
