package linkedlist;
/*
 * Steps
 * ===============================
 * 1.creating variables for linklist
 * 2.creating contstructor
 * 3.to strings to print the linklist
 * ================================
 */

public class LL {
	/*
	 * 1.creating variables for linklist
	 */
	public int a;
	public int b;
	public int c;
	public LL next;

	/*
	 * 2.creating contstructor
	 */
	public LL(int a, int b, int c, LL next) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.next = next;
	}

	/*
	 * 3.to strings to print the linklist
	 */
	public String toString() {
		return a + "->" + b + "->" + c;

	}
}
