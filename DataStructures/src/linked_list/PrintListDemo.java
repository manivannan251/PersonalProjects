package linked_list;

public class PrintListDemo {

	public static void main(String[] args) {
		ListNode<Integer> node1 = new ListNode<>(7);
		ListNode<Integer> node2 = new ListNode<>(17);
		
		node1.setNext(node2);
		printListNode(node1);
		

	}
	
	private static void printListNode(ListNode<Integer> node) {
		System.out.print("[");
		while(node!=null) {
			System.out.print(node.getData());
			if(node.getNext()!=null)
				System.out.print(",");
			node = node.getNext();
		}
		System.out.println("]");
	}

}
