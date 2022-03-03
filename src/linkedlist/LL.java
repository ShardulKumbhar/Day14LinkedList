package linkedlist;


public class LL {
	
	/*
	 * Step
	 * ============================================
	 * 1.Creating node
	 * 2.created method addNode to add data in linedList
	 * 3. Method to search a node in LinkedList and delete
	 * 4.created method to check the size of linked list
	 * 5.created method to print the linked list
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
	 * 3. Method to search a node in LinkedList and delete.
	 */
	public void searchDelete(int searchKey) {
		Node previous = head;
		Node current = previous.next;
		while (current != null) {

			if (current.data == searchKey) {
				System.out.println("Need to search 40 and delete it");
				previous = previous.next;
			}
			previous.next = current;
			current = current.next;
		}
	}
	
	/*
	 * 4.created method to check the size of linked list
	 */
	
	public int getSize() {
		int count = 0;
		if (head == null)
			return count;
		else {
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			System.out.println("Size is " + count);
			return count;
		}
	}

	/*
	 * 5.created method to print the linked list
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