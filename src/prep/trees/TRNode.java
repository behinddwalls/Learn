package prep.trees;

public class TRNode {
	private int data;
	private TRNode left;
	private TRNode right;
	private TRNode nextRight;

	public TRNode(int data) {
		this.data = data;
		this.left = this.right = this.nextRight = null;
	}

	public TRNode newNode(int data) {
		TRNode root = new TRNode(data);
		return root;
	}

	public void printInorder(TRNode root) {
		if (null != root) {
			printInorder(root.left);
			System.out.print(root.data + " ");
			printInorder(root.right);
		}
	}

	public boolean isBST(TRNode prev) {
		if (this != null) {
			if (this.left != null)
				if (!this.left.isBST(prev))
					return false;
			if (prev != null && this.data <= prev.data)
				return false;
			prev = this;
			if (this.right != null)
				return this.right.isBST(prev);
		}
		return true;
	}

	public boolean isSubTree(TRNode tree, TRNode subTree) {
		if (null == subTree)
			return true;
		if (tree == null)
			return false;
		if (this.areIdentical(tree, subTree))
			return true;
		return this.isSubTree(tree.left, subTree)
				|| this.isSubTree(tree.right, subTree);
	}

	public boolean areIdentical(TRNode tree1, TRNode tree2) {
		if (tree1 == null && tree2 == null)
			return true;
		if (tree1 == null || tree2 == null)
			return false;
		return tree1.data == tree2.data
				&& this.areIdentical(tree1.left, tree2.left)
				&& this.areIdentical(tree1.right, tree2.right);
	}

	public void transformToMirrorTree(TRNode root) {
		if (root == null)
			return;
		transformToMirrorTree(root.left);
		transformToMirrorTree(root.right);
		TRNode temp = root.right;
		root.right = root.left;
		root.left = temp;
	}

	public void printView(TRNode root, boolean isLeft, IntWrap maxLevel,
			int level) {
		if (root == null)
			return;
		if (maxLevel == null)
			maxLevel = new IntWrap(0);
		if (maxLevel.value < level) {
			System.out.print(root.data + " ");
			maxLevel.value = level;
		}
		if (isLeft) {
			printView(root.left, isLeft, maxLevel, level + 1);
			printView(root.right, isLeft, maxLevel, level + 1);
		} else {
			printView(root.right, isLeft, maxLevel, level + 1);
			printView(root.left, isLeft, maxLevel, level + 1);
		}
	}

	/**
	 * @return the data
	 */
	public int data() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public TRNode left() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(TRNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public TRNode right() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(TRNode right) {
		this.right = right;
	}

	/**
	 * @return the nextRight
	 */
	public TRNode nextRight() {
		return nextRight;
	}

	/**
	 * @param nextRight
	 *            the nextRight to set
	 */
	public void setNextRight(TRNode nextRight) {
		this.nextRight = nextRight;
	}

}
