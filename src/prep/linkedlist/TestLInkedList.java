package prep.linkedlist;

public class TestLInkedList {
	public static void main(String[] args) {
		LLNode head = new LLNode(0);
		for (int i = 1; i < 9; i++)
			head = head.insert(head, i, true);
		head.printList(head);
		System.out.println();
		LLNode node = head.reverseAltKNodes(head, 3, true);
		head.printList(node);
	}

}
