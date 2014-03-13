package prep.trees;

public class AddFromDescendent {
	static int oldValue = 0;

	public static void main(String[] args) {
		TRNode root = new TRNode(30);
		root.setLeft(new TRNode(10));
		root.setRight(new TRNode(15));
		root.left().setLeft(new TRNode(35));
		root.left().setRight(new TRNode(38));
		root.right().setRight(new TRNode(40));
		root.right().setLeft(new TRNode(45));
		addValueToNode(root);
		root.printInorder(root);

		TRNode root1 = new TRNode(30);
		root1.setLeft(new TRNode(10));
		root1.setRight(new TRNode(15));
		root1.left().setLeft(new TRNode(35));
		root1.left().setRight(new TRNode(38));
		root1.right().setRight(new TRNode(40));
		root1.right().setLeft(new TRNode(45));
		IntWrap oldIntWrap = new IntWrap(0);
		addValueToNodeWOStatic(root1, null);
		System.out.println();
		root1.printInorder(root1);

	}

	static void addValueToNode(TRNode root) {
		if (null == root)
			return;
		addValueToNode(root.left());
		int temp = root.data();
		if (root.left() == null && root.right() == null)
			root.setData(0);
		else
			root.setData(oldValue);
		oldValue += temp;
		addValueToNode(root.right());
	}

	static void addValueToNodeWOStatic(TRNode root, IntWrap oldValue) {
		if (null == root)
			return;
		if (oldValue == null)
			oldValue = new IntWrap(0);
		addValueToNodeWOStatic(root.left(), oldValue);
		int temp = root.data();
		if (root.left() == null && root.right() == null)
			root.setData(0);
		else
			root.setData(oldValue.value);
		oldValue.value += temp;
		addValueToNodeWOStatic(root.right(), oldValue);
	}

}
