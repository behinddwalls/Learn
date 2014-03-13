package prep.trees;

public class TestTree {

	public static void main(String args[]) {

		TRNode root = new TRNode(30);
		root.setLeft(new TRNode(10));
		root.setRight(new TRNode(32));
		root.right().setRight(new TRNode(4));

		TRNode subTree = new TRNode(32);
		subTree.setRight(new TRNode(4));
		System.out.println(root.isSubTree(root, subTree));
		root.printInorder(root);
		root.transformToMirrorTree(root);
		System.out.println();
		root.printInorder(root);
		System.out.println();
		System.out.println("Left view:");
		root.printView(root, true, null, 1);
		System.out.println();
		System.out.println("Right view:");
		root.printView(root, false, null, 1);
		int i = 5;
		long j = 10;
		i += j;

	}
}
