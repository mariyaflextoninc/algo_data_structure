import java.security.GeneralSecurityException;

public class BTreeFromInorderPreOrder {
	private static int pIndex = 0 ;
	public static void main(String[] args) {
		int inorder[] = {2,5,6,10,12,14,15};
		int preorder[] ={10,5,2,6,14,12,15};
		NodeB root = makeBTree(inorder, preorder,0,inorder.length - 1);
		printBTree(root);
	}
	
	public static NodeB makeBTree(int inorder[], int preOrder[], int stIndx, int endIndx){
		if(stIndx > endIndx){
			return null;
		}
		NodeB root = new NodeB(preOrder[pIndex]);
		System.out.println("current root ="+root.data);
		
		pIndex++;
		
		if(stIndx == endIndx){
			return root;
		}
		int index = getIndexofRoot(inorder, stIndx, endIndx, root);
		
		root.left = makeBTree(inorder, preOrder, stIndx, index-1);
		root.right = makeBTree(inorder, preOrder, index +1, endIndx);
		return root;
	}
	
	public static int getIndexofRoot(int inorder[],int start,int end ,NodeB root){
		for(int i = start; i < end ; i ++){
			if(root.data == inorder[i]){
				return i;
			}
		}
		
		return -1;
	}
	public static void printBTree(NodeB root){
		if(root != null){
			printBTree(root.left);
			printBTree(root.right);
			System.out.println(root.data);
		}
	}

}

class MyBinaryTree{
	NodeB root;
	
	public MyBinaryTree(){
		root = null;
	}
	public MyBinaryTree(int data){
		root = new NodeB(data);
	}
	public void insert(int id){
		NodeB node = new NodeB(id);
		NodeB current = root;
		if(root == null){
			root = node;
		}
		while(true){
			
			if(id > current.data){
				if(current.right == null){
					current.right = node;
					return;
				}
				current = current.left;
			}
			else if(id < current.data){
				if(current.left == null){
					current.left = node;
					return;
				}
				current = current.right;
			}
		}
	}
	
}
class NodeB{
	NodeB left;
	NodeB right;
	int data;
	public NodeB(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		
	}
}
