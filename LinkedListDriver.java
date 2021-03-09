
public class LinkedListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.add_start(10);
		list.add_start(20);
		list.add_start(30);
		list.add_last(100);
		list.add_last(200);
		list.add_last(300);
		list.add_before(300, 500);
		list.add_next(500, 700);
		list.add_before(700, 900);
		list.print();
	}

}
