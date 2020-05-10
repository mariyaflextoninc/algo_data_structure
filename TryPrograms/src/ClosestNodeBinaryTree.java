
public class ClosestNodeBinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(2);
		tree.insert(4);
		tree.insert(6);
		tree.insert(1);
		tree.display();
		System.out.println("result = "+tree.closestAncestor(3));
	}

}

class BinaryTree{
	private Node1 root;
	public BinaryTree(){
		root = null;
	}
	
	public void insert(int id){
		Node1 node = new Node1(id);
		if(root == null ){
			root = node;
			return;
		}
		Node1 current = root;
		Node1 parent = null;
		while(true){
			parent = current; 
			if(current.data < id){
				current = current.right;
				if(current == null){
					parent.right = node;
					return;
				}
			}else{
				current = current.left;
				if(current == null){
					parent.left = node;
					return;
				}
			}
		}
		
	}
	public int closestAncestor(int id){
		int minDistance = root.data - id;
		Node1 current = root;
		int min = root.data;
		while(current != null){
			minDistance = current.data - id;
			if(min > minDistance){
				min = current.data;
			}
			if(minDistance >0){
				current = current.left;
				
			}else if(minDistance<0){
				current = current.right;
				
			}else {
				return current.data;
			}
		}
		return min;
	}
	public void display(){
		displayRoot(root);
	}
	public void displayRoot(Node1 node){
		if(node != null){
			displayRoot(node.left);
			System.out.println(node.data);
			displayRoot(node.right);
		}
	}
	
}
class Node1{
	public int data ; 
	public Node1 left; 
	public Node1 right;
	
	public Node1(int id){
		this.data = id;
		this.left = null;
		this.right = null;
	}
}

