package linkedlist;

/* 
 * Steps
 * ==================================
 * 1.Starting of node head;
 * 2.creating variable
 * 3.creating constructor
 * 4.Created method to add value to the first of linked list
 * 5.Created method to Print the LinkedList
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
	 * 4.Created method to add value to the first of linked list
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
	 * 5.Created method to Print the LinkedList
	 */
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
}