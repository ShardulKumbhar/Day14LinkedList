package linkedlist;


public class LL {
	
	/*
	 * Step
	 * ============================================
	 * 1.Creating node
	 * 2.created method addNode to add data in linedList
	 * 3. Method to search LinkedList and insert a node after 30
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
	 * 3. Method to search LinkedList and insert a node after 30
	 */
	public void searchInsert(int searchKey, int data) {
		Node current = head;
		Node newNode = new Node();
		newNode.data = data;
		int i = 0;
		while (current != null) {

			if (current.data == searchKey) {
				System.out.println("Need to add 40 after 30");
				newNode.next = current.next;
				current.next = newNode;
			}
			i++;
			current = current.next;
		}
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