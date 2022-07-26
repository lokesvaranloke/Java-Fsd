package LinkedList;

class node {
	int data;
	node next;

	node(int d) {
		data = d;
		next = null;
	}
}

public class circularLL {

	node head;

	circularLL() {
		head = null;
	}

	void insert(node new_node) {
		node current = head;

		if (current == null) {
			new_node.next = new_node;
			head = new_node;

		} else if (current.data >= new_node.data) {

			while (current.next != head)
				current = current.next;

			current.next = new_node;
			new_node.next = head;
			head = new_node;
		} else {

			while (current.next != head && current.next.data < new_node.data)
				current = current.next;

			new_node.next = current.next;
			current.next = new_node;
		}
	}

	void show() {
		if (head != null) {
			node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}

	public static void main(String[] args) {
		circularLL list = new circularLL();

		int arr[] = new int[] { 12, 56, 2, 11, 1, 90 };

		node temp = null;

		for (int i = 0; i < 6; i++) {
			temp = new node(arr[i]);
			list.insert(temp);
		}

		list.show();
	}
}
