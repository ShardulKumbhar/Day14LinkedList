package linkedlist;

public class Main {

		
	    /*
	     * PROCEDURE
	     * ====================
	     * 1.Creating object of linked list
	     * 2.calling method to add node to the linkedlist
	     * 3.calling method to print the linkedlist
	     * 4. Sorting linked list in Asscending Order
	     * 5.calling method to print the linkedlist
	     * =====================
	     */

		public static void main(String[] args) {

			/*
			 * 1.Creating object of linked list
			 */
			LL list = new LL();

			/*
			 * 2.calling method to add node to the linkedlist
			 */
			list.addNode(56);
			list.addNode(30);
			list.addNode(40);
			list.addNode(70);
			/*
			 * 3.calling method to print the linkedlist
			 */
			list.printLinkedList();

			/*
			 * 4. Sorting linked list in Asscending Order.
			 */
			list.sorting();

			/*
			 * calling method to print the linkedlist
			 */
			list.printLinkedList();
		}
	}
