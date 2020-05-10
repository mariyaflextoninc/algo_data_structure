import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTreeTraversal {

	public static void main(String[] args) {
		Binaryree node = new Binaryree();
		node.root = new NodeB(1);
		node.root.left = new NodeB(2);
		node.root.right = new NodeB(3);
		node.root.left.left = new NodeB(4);
		node.root.left.right = new NodeB(5);
		node.printLevel();
	}

}
class Binaryree{
	NodeB root;
	
	public void printLevel(){
		Queue<NodeB> queue = new LinkedList<NodeB>();
		queue.add(root);
		while(!queue.isEmpty()){
			NodeB node = queue.poll();
			System.out.println(node.data+" ");
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
		}
		
	}
	
}

