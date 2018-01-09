/* ***************************************************
 * <your name>
 * <the date>
 * <the file name>
 *
 * <a simple, short program/class description>
 *************************************************** */
 
class Node<T>
{
	private T data;
	private Node<T> link;
	
	public Node()
	{
		this.data = null;
		this.link = null;
	}
	
	public T getData()
	{
		return this.data;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public Node<T> getLink()
	{
		return this.link;
	}
	
	public void setLink(Node<T> link)
	{
		this.link = link;
	}
}

public class Queue<T>
{
	public static final int MAX_SIZE = 50;
	
	private Node<T> head;
	private Node<T> tail;
	private int num_items;
	
	public Queue()
	{
		this.head = null;
		this.tail = null;
		this.num_items = 0;
	}
	
	public Queue(Queue<T> s)
	{
		this.head = null;
		this.tail = null;
		this.num_items = 0;
		
		Node<T> ts = s.head;
		while (!this.IsFull() && ts != null)
		{
			Node<T> tn = new Node<T>();
			tn.setData(ts.getData());
			if (this.num_items == 0)
			{
				this.head = tn;
			}
			else
			{
				this.tail.setLink(tn);
			}
			this.tail = tn;
			this.num_items++;
			ts = ts.getLink();
		}
	}
	
	public void Enqueue(T data)
	{
		if (!this.IsFull())
		{
			Node<T> tn = new Node<T>();
			tn.setData(data);
			if (this.IsEmpty())
			{
				this.head = tn;
			}
			else
			{
				this.tail.setLink(tn);
			}
			this.tail = tn;
			this.num_items++;
		}
		else
		{
			return;
		}
	}
	
	public T Dequeue()
	{
		if (!this.IsEmpty())
		{
			T data = this.head.getData();
			if (this.Size() == 1)
			{
				this.tail = null;
			}
			this.head = this.head.getLink();
			this.num_items--;
			return data;
		}
		else
		{
			return null;
		}
	}
	
	public T Peek()
	{
		if (this.IsEmpty())
		{
			return null;
		}
		else
		{
			return this.head.getData();
		}
	}
	
	public int Size()
	{
		return this.num_items;
	}
	
	public boolean IsEmpty()
	{
		return (this.num_items == 0);
	}
	
	public boolean IsFull()
	{
		return (this.num_items == MAX_SIZE);
	}
	
	public boolean Equals(Queue<T> s)
	{
		if (this.Size() != s.Size())
		{
			return false;
		}
		
		Node<T> ts = s.head;
		Node<T> tn = this.head;
		
		while (ts != null)
		{
			if (ts.getData() != tn.getData())
			{
				return false;
			}
			ts = ts.getLink();
			tn = tn.getLink();
		}
		return true;
	}
	
	public Queue<T> Add(Queue<T> s)
	{
		Queue<T> qt = new Queue<T>(this);
		
		Node<T> ts = s.head;
//		Node<T> tn = qt.tail;
		
		while (!qt.IsFull() && ts != null)
		{
			Node<T> tn2 = new Node<T>();
			tn2.setData(ts.getData());
			if (qt.IsEmpty())
			{
				qt.head = tn2;
			}
			else
			{
				qt.tail.setLink(tn2);
			}
			qt.tail = tn2;
			qt.num_items++;
			ts = ts.getLink();
		}
		
		return qt;
			
	}
	
	public String toString()
	{
		if (this.IsEmpty())
		{
			return "NULL";
		}
		
		String s = "";
		
		Node<T> tn = this.head;
		
		while (tn != null)
		{
			s += tn.getData() + " ";
			tn = tn.getLink();
		}
		
		return s;
	}
}