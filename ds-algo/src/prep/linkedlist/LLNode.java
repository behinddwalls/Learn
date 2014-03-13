package prep.linkedlist;

public class LLNode {

	int data;
	LLNode nextNode;
	LLNode arbitNode;
	LLNode prevNode;

	public LLNode(int data) {
		this.data = data;
		this.nextNode = null;
		this.arbitNode = this;
	}

	public void printList(LLNode head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.nextNode;
		}
	}

	public LLNode insert(LLNode head, int data, boolean atFront) {
		if (atFront) {
			if (null == head) {
				head = new LLNode(data);
				return head;
			} else {
				LLNode temp = new LLNode(data);
				temp.nextNode = head;
				head = temp;
				return head;
			}
		} else {
			LLNode headRef = head;
			if (null == head) {
				head = new LLNode(data);
				return head;
			} else {
				while (head.nextNode != null)
					head = head.nextNode;

				LLNode temp = new LLNode(data);
				head.nextNode = temp;
				return headRef;
			}
		}
	}

	public LLNode reverse(LLNode head) {
		if (head == null)
			return null;
		LLNode current = head;
		LLNode prev = null;
		LLNode next = null;
		while (current != null) {
			next = current.nextNode;
			current.nextNode = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public LLNode reverseKNodes(LLNode head, int K) {
		if (head == null)
			return null;
		LLNode current = head;
		LLNode next = null;
		LLNode prev = null;
		int count = 0;
		while (current != null && count < K) {
			next = current.nextNode;
			current.nextNode = prev;
			prev = current;
			current = next;
			count++;
		}
		if (current != null)
			head.nextNode = reverseKNodes(current, K);
		return prev;
	}

	public LLNode reverseAltKNodes(LLNode head, int K, boolean isAlt) {
		if (head == null)
			return null;
		LLNode current = head;
		LLNode next = null, prev = null;
		int count = 0;
		while (current != null && count < K) {
			next = current.nextNode;
			if (isAlt)
				current.nextNode = prev;
			prev = current;
			current = next;
			count++;
		}
		if (isAlt) {
			head.nextNode = reverseAltKNodes(current, K, !isAlt);
			return prev;
		} else {
			prev.nextNode = reverseAltKNodes(current, K, !isAlt);
			return head;
		}
	}

	// TODO: Fix it.(Wrong Answer)
	public LLNode cloneLLWithArbitPointer(LLNode headOriginal) {
		if (headOriginal == null)
			return null;
		LLNode headRef = headOriginal;
		LLNode next = null;
		LLNode clonedNode = null;
		while (headRef != null) {
			LLNode newNode = new LLNode(headRef.data);
			next = headRef.nextNode;
			headRef.nextNode = newNode;
			newNode.nextNode = next;
			headRef = next;
		}
		// copy arbit node
		headRef = headOriginal;
		while (headRef != null && headRef.nextNode != null
				&& headRef.arbitNode != null) {
			headRef.nextNode.arbitNode = headRef.arbitNode.nextNode;
			clonedNode = headRef;
			headRef = headRef.nextNode.nextNode;
		}
		clonedNode.nextNode = null;
		headRef = headOriginal;
		clonedNode = headRef.nextNode;
		while (headRef != null && headRef.nextNode != null) {
			headRef.nextNode = headRef.nextNode.nextNode;
			clonedNode.nextNode = clonedNode.nextNode.nextNode;
			headRef = headRef.nextNode;
			clonedNode = clonedNode.nextNode;
		}
		return clonedNode;
	}
}
