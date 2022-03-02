package linkedlist;

public class LL {
	Node head; // Start head

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// add to first value
	public void addFirst(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void deleteFirst() { // to delete first value

		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		head = head.next;
	}

	public void deleteLast() { // to delete last value

		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node LastNode = head.next;
		while (LastNode.next != null) {
			LastNode = LastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public void printList() { // to print output

		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null)

		{
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}

		System.out.println("Null");
	}

	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);// addind 56 to linked list
		list.printList();// printing list

		list.deleteLast(); // deleting last value
		list.printList();

	}
}