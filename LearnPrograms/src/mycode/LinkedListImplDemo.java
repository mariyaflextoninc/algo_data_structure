package mycode;

public class LinkedListImplDemo {

	public static void main(String[] args) {
		LinkedListImp<Integer,Integer> link = new LinkedListImp();
		link.add(2, 12);
		link.add(2, 13);
		link.add(3, 13);
		link.add(4, 14);
		link.add(5, 15);
		System.out.println("LinkedList = "+link.toString() );
		//link.remove(2);
		link.walk(2, new MyClass());
		link.walk(2, new MyClass2());
		System.out.println("Removed = "+link.toString() );
		System.out.println("find = "+link.find(2));
		link.reverseList();
		System.err.println("Reversed = "+link.toString());
		
	}

}
class LinkedListImp<K,T>{
	
	NodeLink<K,T> head;
	
	public LinkedListImp(){
		head =  null;
	}
	
	public void reverseList(){
		
		NodeLink<K,T> curr = head;
		NodeLink<K,T> prev = null;
		NodeLink<K,T> temp = null;
		while(curr != null){
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
	}
	public void walk(K key, MyInterface myRef){
		NodeLink<K,T> curr = head;
		while(curr!= null){
			if(curr.key == key){
				myRef.myMethod(curr.data);
			}
			curr = curr.next;
			
		}
		
	}
	
	public void add(K key, T data){
		if(key == null || data == null){
			return;
		}
		NodeLink<K,T> node = new NodeLink(key, data);
		if(head == null){
			head = node;
			return;
		}
		NodeLink<K,T> curr = head;
		NodeLink<K,T> prev = null;
		while(curr!= null){
			prev = curr;
			curr = curr.next;
		}
		prev.next = node;
	}
	
	public T find(T key){
		if(head == null || key == null ){
			return null;
		}
		NodeLink<K,T> curr = head;
		while(curr != null){
			if(curr.key == key){
				return curr.data;
			}
		}
		System.out.println("Key not found in Linked list");
		return null;
 	}
	
	public void remove(T key){
		if(key == null || head == null){
			System.out.println("Empty Linked List");
			return;
		}
		NodeLink<K,T> curr = head;
		NodeLink<K,T> prev = null;
		while(curr != null){
			if(curr.key == key ){
				if(prev == null){
					head = curr.next;
					curr = head;
					//break;
				}else{
					prev.next = curr.next;
					curr = curr.next;
					//break;
				}	
			}
			else{
				curr = curr.next;
				prev = curr;
			}
		}
		//System.out.println("Key not found. Cannot remove");
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		NodeLink<K,T> node =  head;
		while(node != null){
			sb.append(node.key +"-->"+ node.data+" , ");
			node = node.next;
		}
		return sb.toString();
	}
	
}

class NodeLink<K,T>{
	NodeLink next;
	K key;
	T data;
	
	public NodeLink(K key,T data){
		if(data != null){
			this.key = key;
			this.data = data;
			this.next = null;
		}
		
	}
	
}
interface MyInterface{
	public void myMethod(Object data);
}
class MyClass implements MyInterface{

	@Override
	public void myMethod(Object data) {
		System.out.println("test = "+data);
	}
	
}

class MyClass2 implements MyInterface{

	@Override
	public void myMethod(Object data) {
		System.out.println("test 2= "+data);
	}
	
}