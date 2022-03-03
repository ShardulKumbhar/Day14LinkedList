package linkedlist;


public class LL {
	
	/*
	 * Step
	 * ============================================
	 * 1.Creating node
	 * 2.created method addNode to add data in linedList
	 * 3. Method to sort LinkedList in Asscending Order.
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
	 * 3. Method to sort LinkedList in Asscending Order.
	 */
	public void sorting() {
		Node pointer = head;
		int temp;
		System.out.print("Sorting LinkedList in Asscending Order: ");
		while (pointer.next != null) {
			Node currentpointer = pointer.next;
			while (currentpointer != null) {
				if (pointer.data > currentpointer.data) {
					temp = pointer.data;
					pointer.data = currentpointer.data;
					currentpointer.data = temp;
				}
				currentpointer = currentpointer.next;
			}
			pointer = pointer.next;
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