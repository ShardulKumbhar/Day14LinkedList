package linkedlist;


public class LL {
	
	/*
	 * Step
	 * ============================================
	 * 1.Creating node
	 * 2.created method addNode to add data in linedList
	 *  3. Method to search LinkedList to find Node with value 30
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
	 * 3. Method to search LinkedList to find Node with value 30
	 */
	public void search(int searchKey) {
		Node current = head;
		int i=0;
		while(current != null)
		{
			
			if(current.data == searchKey)
			{
				System.out.println("Find whether "+searchKey+" is Present or not:-");
				System.out.println(searchKey +" is Present");
				break;
			}
			i++;
			current = current.next;
		}
		System.out.println("Index No : "+i);
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