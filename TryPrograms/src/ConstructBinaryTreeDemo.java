import java.util.HashMap;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class ConstructBinaryTreeDemo {

	public static void main(String[] args) {
		Relation[] rel = new Relation[7];
		rel[0] = new Relation(15, 20, true);
		rel[1] = new Relation(19, 80, true);
		rel[2] = new Relation(17, 20, false);
		rel[3] = new Relation(16, 80, false);
		rel[4] = new Relation(80, 50, false);
		rel[5] = new Relation(50, null, false);
		rel[6] = new Relation(20, 50, true);
		DynamicBTree obj = new DynamicBTree();
		obj.constructBTree(rel);
		obj.display();
	}

}
class DynamicBTree<Integer>{
	NodeBT<Integer> root;
	public void  constructBTree(Relation[] rel){
		HashMap<Integer,NodeBT<Integer>> map = new HashMap();
		for(int i =0; i < rel.length;i++){
			NodeBT<Integer> nodeP = map.get(rel[i].parent);
			NodeBT<Integer> nodeC = map.get(rel[i].child);
			if(nodeC == null){
				nodeC = new NodeBT(rel[i].child);
				map.put((Integer) rel[i].child, nodeC);
			}
			if(nodeP == null){
				nodeP = new NodeBT(rel[i].parent);
				map.put((Integer) rel[i].parent, nodeP);
			}
			if(nodeP.data != null){
				if(rel[i].isLeft ){
					nodeP.left = nodeC;
				}
				else{
					nodeP.right = nodeC;
				}
			}
			else{
				root = map.get(rel[i].child);
			}
		}
		
	}
	public void display(){
		displayThis(root);
	}
	public void displayThis(NodeBT root){
		if(root != null){
			System.out.println(root.data);
			displayThis(root.left);
			displayThis(root.right);
		}
	}
}
class Relation{
	Integer parent;
	Integer child;
	boolean isLeft;
	
	public Relation( Integer c,Integer p, boolean flag){
		this.child = c;
		this.parent = p;
		this.isLeft = flag;
	}
	
}
@SuppressWarnings("hiding")
class NodeBT<Integer>{
	Integer data;
	NodeBT<Integer> left;
	NodeBT<Integer> right;
	public NodeBT(Integer data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
