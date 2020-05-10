import java.util.Stack;

public class MakeBtreePreOrderNonRecursive{
	public NodeB constructTree(int[] preorder) {
		Stack<NodeB> s = new Stack<NodeB>();
		NodeB root = new NodeB(preorder[0]);
		s.add(root);
		for (int i = 1; i < preorder.length; i++) {
			NodeB x = null;
			while (!s.isEmpty() && preorder[i] > s.peek().data) {
				x = s.pop();
			}
			if (x != null) {
				x.right = new NodeB(preorder[i]);
				s.push(x.right);
			} else {
				s.peek().left = new NodeB(preorder[i]);
				s.push(s.peek().left);
			}
		}
		return root;
	}

	public void displayTree(NodeB root) {
		if (root != null) {
			displayTree(root.left);
			System.out.print(" " + root.data);
			displayTree(root.right);
		}
	}

	public static void main(String args[]) {
		MakeBtreePreOrderNonRecursive p = new MakeBtreePreOrderNonRecursive();
		 int[] preOrder = {10,5,2,7,15,12,20 };
		NodeB root = p.constructTree(preOrder);
		System.out.println("Inorder Traversal of Constructed Tree : ");
		p.displayTree(root);
	}
}