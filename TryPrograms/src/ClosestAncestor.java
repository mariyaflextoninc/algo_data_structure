
public class ClosestAncestor {

	public static void main(String[] args) {
		BTree node = new BTree();
		node.root = new Node1(1);
		node.root.left = new Node1(2);
		node.root.right = new Node1(3);
		node.root.left.left = new Node1(4);
		node.root.left.right = new Node1(5);
		node.root.right.left = new Node1(6);
		node.root.right.right = new Node1(7);
		System.out.println("lca = "+node.findAncestor(4, 5).data);
	}

}
class BTree{
	Node1 root;
	
	public BTree(){
		
	}
	public Node1 findAncestor(int n1, int n2){
		return findAncestorNode(root, n1, n2);
	}
	private Node1 findAncestorNode(Node1 node ,int n1,int n2){
		
		if(node == null){
			return null;
		}
		if(node.data == n1 || node.data == n2){
			return node;
		}
		Node1 left_lca = findAncestorNode(node.left, n1, n2);
		Node1 right_lca = findAncestorNode(node.right, n1, n2);
		
		if(left_lca != null && right_lca != null){
			return node;
		}
		
		return left_lca!= null?left_lca:right_lca;
	}
	
}
