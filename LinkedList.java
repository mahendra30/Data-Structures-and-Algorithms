
public class LinkedList {
	Node startNode;
	public LinkedList()
	{
		this.startNode = null;
	}
	public void add_start(int value)
	{
		if(startNode == null)
		{
			startNode = new Node(value);
		}
		else
		{
			Node temp = new Node(value);
			temp.next = startNode;
			startNode = temp;
		}
	}
	public void add_last(int value)
	{
		if(startNode == null)
		{
			startNode = new Node(value);
		}
		else
		{
			Node temp = new Node(value);
			Node curr_node = startNode;
			while(curr_node.next != null)
			{
				curr_node = curr_node.next;
			}
			curr_node.next = temp;
		}
	}
	public void add_next(int data1 , int data2)
	{
		Node curr_node = startNode;
		while(curr_node.data != data1)
		{
			curr_node = curr_node.next;
		}
		if(curr_node == null)
		{
			System.out.println("No such valid data present");
		}
		else
		{
			Node temp = new Node(data2);
			Node next1 = curr_node.next;
			curr_node.next = temp;
			temp.next = next1;
		}
	}
	public void add_before(int data1 , int data2)
	{
		Node curr_node = startNode;
		while(curr_node != null && curr_node.next.data != data1)
		{
			curr_node = curr_node.next;
		}
		if(curr_node == null)
		{
			System.out.println("No such valid data present");
		}
		else
		{
			Node temp = new Node(data2);
			Node next1 = curr_node.next;
			curr_node.next = temp;
			temp.next = next1;
		}
	}
	public void print()
	{
		Node curr_node = startNode;
		while(curr_node!=null)
		{
			System.out.println(curr_node.data);
			curr_node = curr_node.next;
		}
	}

}
