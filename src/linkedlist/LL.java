package linkedlist;


public class LL {
	
	/*
	 * Step
	 * ============================================
	 * 1.Creating node
	 * 2.created method addNode to add data in linedList
	 * 3.created method to insert data in between
	 * 4.created method to print the linked list
	 * ============================================
	 */
	
	public class Node {
		/*
		 * 1.Creating node
		 */
		public int data;
		public Node next;

	}

	Node head;

	/*
	 * 2.created method addNode to add data in linedList
	 */
	public void addNode(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (head == null) {
			head = newNode;
		} else {
			Node pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}
	}

	/*
	 * 3.created method to insert data in between
	 */
	public void insertAt(int index, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		Node position = head;
		for (int i = 0; i < index - 1; i++) {
			position = position.next;
		}
		newNode.next = position.next;
		position.next = newNode;
		System.out.println("Element is added in between: " + newNode.data);
	}

	/*
	 * 4.created method to print the linked list
	 */
	public void printLinkedList() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
}