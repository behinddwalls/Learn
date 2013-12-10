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
