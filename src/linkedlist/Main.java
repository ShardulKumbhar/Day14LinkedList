package linkedlist;

public class Main {

		
	    /*
	     * PROCEDURE
	     * ====================
	     * 1.Creating object of linked list
	     * 2.calling method to add node to the linkedlist
	     * 3.calling method to print the linkedlist
	     * 4.Searching for node
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
			list.addNode(70);
			list.addNode(30);
			/*
			 * 3.calling method to print the linkedlist
			 */
			list.printLinkedList();

			/*
			 * 4. Searching for node 
			 */
			list.search(30);

		}
	}
