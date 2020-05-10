import MyLinkedList2.Node;

public class LinkedListIntersection {

	public static void main(String[] args) {
		
		MyLinkedList2<Integer> list = new MyLinkedList2<Integer>();
		list.insert(12);
		list.insert(13);
		list.insert(14);
		list.insert(15);
	}
	public int hasIntersection(MyLinkedList2 sl1, MyLinkedList2 sl2){
		int sl1Len = sl1.getLength();
		int sl2Len = sl2.getLength();
		int diff = sl1Len - sl2Len;
		Node root = sl1.root;
		if(sl1Len > sl2Len ){
			while(){
				
			}
			
		}
	}
}

class MyLinkedList2<T extends Comparable>{
	public Node<T> root;
	
	
	public int getLength(){
		
		int count = 0 ;
		Node current = root;
		while(current != null){
			count++;
			current = current.next;	
		}
		return count;
	}
	
	public void insert(T data){
		Node<T> node = new Node(data);
		if(root == null){
			root = node;
			return;
		}
	    Node prev  = null;
	    Node current = root;
	    
	    while(current != null){
	    	prev = current;
	    	current = current.next;
	    }
	    prev.next = node;
	}
	static class Node<T>{
		Node<T> next;
		T data;
		
		public Node(T data){
			this.next = null;
			this.data = data;
		}
	}
}
