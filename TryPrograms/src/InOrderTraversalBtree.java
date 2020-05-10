import java.util.ArrayList;
import java.util.List;

public class InOrderTraversalBtree {
	
	public static void main(String args[]){
		BinaryTreeNew obj = new BinaryTreeNew(12);
		obj.left = new BinaryTreeNew(10);
		obj.right = new BinaryTreeNew(15);
		obj.left.left = new BinaryTreeNew(9);
		obj.left.right = new BinaryTreeNew(11);
		obj.right.left = new BinaryTreeNew(13);
		obj.right.right = new BinaryTreeNew(16);
		
		System.out.println(constructBTree(constructList(obj)).data);
	}
	
	public static List<Integer> constructList(BinaryTreeNew root){
		List<Integer> result = new ArrayList<Integer>();
		construct(root,result);
		System.out.println(result.toString());
		return result;
	}
	
	public static void construct(BinaryTreeNew node,List<Integer> result){
		if(node == null){
			result.add(null);
			return ;
		}
		result.add(node.data);
		construct(node.left, result);
		construct(node.right, result);
		return;
	}
	
	public static BinaryTreeNew constructBTree(List<Integer> list){
		return listToBTree(list);
	}
	
	public static BinaryTreeNew listToBTree(List<Integer> list){
		if(list.size() == 0){
			return null;
		}
		Integer data = list.remove(0);
		BinaryTreeNew node  = null;
		if(data == null){
			return null;
		}
		node = new BinaryTreeNew(data);
		node.left = listToBTree(list);
		node.right = listToBTree(list);
		return node;
	}
}

class BinaryTreeNew{
	public BinaryTreeNew left;
	public BinaryTreeNew right;
	public Integer data;
	
	
	public BinaryTreeNew(Integer data){
		this.data = data;
	}
}