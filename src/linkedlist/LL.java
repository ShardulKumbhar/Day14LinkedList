package linkedlist;

public class LL {
	public int a;
	public int b;
	public int c;
	public LL next;

	public LL(int a, int b, int c, LL next) { // constructor
		this.a = a;
		this.b = b;
		this.c = c;
		this.next = next;
	}

	public String toString() { // print value
		return a + "->" + b + "->" + c;

	}

	public static void main(String[] args) {
		LL front = new LL(56, 30, 70, null);// creating object front
		System.out.println(front);// calling object
	}
}
