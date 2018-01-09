/* ***************************************************
 * <your name>
 * <the date>
 * <the file name>
 *
 * <a simple, short program/class description>
 *************************************************** */
 
class Node<T> {
	private T data;
	private Node<T> link;
	
	public Node() {
		this.data = null;
		this.link = null;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getLink() {
		return this.link;
	}
	
	public void setLink(Node<T> link) {
		this.link = link;
	}
}

public class Stack<T> {
	public static final int MAX_SIZE = 50;
	
	private Node<T> top;
	private int num_items;
	
	public Stack() {
		this.top = null;
		this.num_items = 0;
	}
	
	public Stack(Stack<T> s) {
		this.top = null;
		this.num_items = 0;
		
		Node<T> tn = s.top;
		Node<T> tn2 = this.top;
		
		while (!this.IsFull() && tn != null) {
			if (tn2 == null) {
				Node<T> tn3 = new Node<T>();
				tn3.setData(tn.getData());
				this.top = tn3;
				tn2 = tn3;
			}
			else {
				Node<T> tn3 = new Node<T>();
				tn3.setData(tn.getData());
				tn2.setLink(tn3);
				tn2 = tn3;
			}
			this.num_items++;
			tn = tn.getLink();
		}
	}
	
	public void Push(T data) {
		if (!this.IsFull()) {
			Node<T> tn = new Node<T>();
			tn.setData(data);
			tn.setLink(this.top);
			this.top = tn;
			this.num_items++;
		}
	}
	
	public T Pop() {
		if (!this.IsEmpty()) {
			T td = this.top.getData();
			this.top = this.top.getLink();
			this.num_items--;
			if (this.IsEmpty()) {
				this.top = null;
			}
			return td;
		}
		else {
			return null;
		}
	}
	
	public T Peek() {
		if (!this.IsEmpty()) {
			return this.top.getData();
		}
		else {
			return null;
		}
	}
	
	public int Size() {
		return this.num_items;
	}
	
	public boolean IsEmpty() {
		return (this.num_items == 0);
	}
	
	public boolean IsFull() {
		return (this.num_items == MAX_SIZE);
	}
	
	public boolean Equals(Stack<T> s) {
		if (this.Size() != s.Size()) {
			return false;
		}
		else {
			Node<T> pn = this.top;
			Node<T> qn = s.top;
			
			while (qn != null) {
				if (pn.getData() != qn.getData()) {
					return false;
				}
				pn = pn.getLink();
				qn = qn.getLink();
			}
			return true;
		}
	}
	
	public Stack<T> Add(Stack<T> s) {
		Stack<T> ts = new Stack<T>(this);
		
		Node<T> tn = s.top;
		Node<T> tn2 = ts.top;
		
		while (tn2 != null && tn2.getLink() != null) {
			tn2 = tn2.getLink();
		}
		
		while (tn != null) {
			Node<T> tn3 = new Node<T>();
			tn3.setData(tn.getData());
			if (tn2 == null) {
				ts.top = tn3;
			}
			else {
				tn2.setLink(tn3);
			}
			ts.num_items++;		// forgot to increment the new stack's size.
			tn2 = tn3;
			tn = tn.getLink();
		}
		return ts;	// forgot to return ts.
	}
	
	public String toString() {
		if (this.IsEmpty()) {
			return "NULL";
		}
		else {
			String s = "";
			
			Node<T> tn = this.top;
			
			while (tn != null) {
				s += tn.getData() + " ";
				tn = tn.getLink();
			}
			return s;
		}
	}
}