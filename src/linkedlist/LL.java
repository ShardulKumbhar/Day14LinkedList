package linkedlist;
/*
 * Steps
 * ===============================
 * 1.creating variables for linklist
 * 2.creating contstructor 
 * 3:Push new data in linked list by creating the head pointer
 * 4.Methord to Print LinkedList
 * ================================
 */

public class LL {
	/*
	 * 1.creating variables for linklist
	 */
	public int data;
	public LL next;
	public static LL head;

	/*
	 * 2.creating contstructor
	 */
	public LL(int data, LL next) {
		super();
		this.data = data;
		this.next = head;
	}

	public LL(int data) {
		super();
		this.data = data;

	}

	public String toString() {
		return data + "";

	}

	/*
	 * 3:Push new data in linked list by creating the head pointer addNode - this
	 * method is created to add data to linedList head - accepting head pointer of
	 * LinkedList data - accepting data to put it in linkedList head - it returns
	 * head of linkedList
	 */
	public LL push(int new_data) {

		/*
		 * Created a new Node
		 */
		LL newNode = new LL(new_data);

		/*
		 * Checking whether any list is available before or not and Initializing new
		 * node to head. If node exist then Initializing head to pointer for reference
		 */
		if (head == null) {
			head = newNode;
		} else {
			LL pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}

		return head;
	}

	/*
	 * 4.Methord to Print LinkedList
	 */

	public void printList() {

		/*
		 * printing the Linked List by verifying conditions
		 */
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			LL pointer = head;
			System.out.print("Linked List: ");
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
		}
	}
}