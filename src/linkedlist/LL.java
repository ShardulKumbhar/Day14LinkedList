package linkedlist;

/* 
 * ==================================
 * 1.Starting of node head
 * 2.creating variable
 * 3.creating constructor
 * 4.Created method to add values to the first value
 * 5.Created method to delete First value
 * 6.Created method to delete Last value
 * 7.Created method to Print the values
 * ====================================
 */

public class LL {
	/*
	 * 1.Starting of node head
	 */
	Node head;
	/*
	 * 2.creating variable
	 */

	class Node {
		int data;
		Node next;

		/*
		 * 3. creating constructor
		 */
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/*
	 * 4.Created method to add values to the first value
	 */
	public void addFirst(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	/*
	 * 5.Created method to delete First value
	 */
	public void deleteFirst() {

		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		head = head.next;
	}

	/*
	 * 6.Created method to delete Last value
	 */
	public void deleteLast() { 

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
	

	/*
	 * 7.Created method to Print the values
	 */
	public void printList() { 

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
}
