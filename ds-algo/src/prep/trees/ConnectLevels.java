package prep.trees;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class ConnectLevels {
	public static void main(String[] args) {
		TRNode root = new TRNode(30);
		root.setLeft(new TRNode(10));
		root.setRight(new TRNode(15));
		root.left().setLeft(new TRNode(35));
		root.right().setRight(new TRNode(40));

		connecTreetLevels(root);
		printNextRight(root);

	}

	static void printNextRight(TRNode root) {
		if (null == root)
			return;
		Queue<TRNode> q = new LinkedBlockingDeque<TRNode>();
		q.add(root);
		while (!q.isEmpty()) {

			TRNode x = q.poll();
			TRNode y = x;
			System.out.print(x.data() + "-->");
			while (x.nextRight() != null) {
				System.out.print(x.nextRight().data() + "-->");
				x = x.nextRight();
			}
			System.out.println();
			if (y != null) {
				if (null != y.left() && y.left().nextRight() != null)
					q.add(y.left());
				if (null != y.right() && y.right().nextRight() != null)
					q.add(y.right());
			}
		}
	}

	static void connecTreetLevels(TRNode root) {
		if (null == root)
			return;
		Queue<TRNode> q = new LinkedBlockingDeque<TRNode>();
		q.add(root);
		int qSize = 0;
		while (!q.isEmpty()) {
			qSize = q.size();
			while (qSize > 0) {
				qSize--;
				TRNode x = q.poll();
				TRNode y = q.poll();
				if (x != null & y != null) {
					qSize--;
					x.setNextRight(y);
				}
				if (x != null) {
					if (null != x.left())
						q.add(x.left());
					if (null != x.right())
						q.add(x.right());
				}
				if (y != null) {
					if (null != y.left())
						q.add(y.left());
					if (null != y.right())
						q.add(y.right());
				}
			}
		}
	}
}
