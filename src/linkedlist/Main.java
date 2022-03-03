package linkedlist;

public class Main {

		
	    /*
	     * PROCEDURE
	     * ====================
	     * 1.Creating object of linked list
	     * 2.calling method to add node to the linkedlist
	     * 3.calling method to print the linkedlist
	     * 4. Searching for given data in linked list and deleting that node
	     * 5.calling method to print the linkedlist
	     * 6.getting size of linked list
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
			 * 4. Searching for given data in linked list and deleting that node
			 */
			list.searchDelete(40);

			/*
			 * 5.calling method to print the linkedlist
			 */
			list.printLinkedList();
			/*
			 * 6.getting size of linked list
			 */
			list.getSize();
		
		}
	}
