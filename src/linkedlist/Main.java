package linkedlist;

public class Main {
	public static void main(String[] args) {
		/*
		 * PROCEDURE 
		 * ================================== 
		 * 1.creating an object 
		 * 2.adding values to the first place as 56->30->70 
		 * 3.Printing linkedList 
		 * 4.deletingLast value in
		 * linked list 
		 * 5. Printing the updated linkedList
		 * ==================================
		 */

		/*
		 * 1.creating an object
		 */
		LL list = new LL();

		/*
		 * 2.adding values to the first place as 56->30->70 
		 */
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);

		/*
		 * 3.Printing linkedList
		 */
		list.printList();

		/*
		 * 4.deletingLast value in linked list
		 */
		list.deleteLast();

		/*
		 * 5. Printing the updated linkedList
		 */
		list.printList();

	}
}
