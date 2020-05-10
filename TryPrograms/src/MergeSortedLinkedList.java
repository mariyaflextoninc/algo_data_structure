import java.util.LinkedList;

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		ListNode<Integer>[] nodeList = new ListNode[2];
		nodeList[0] = new ListNode();
		nodeList[0].add(1);
		nodeList[0].add(3);
		nodeList[0].add(5);
		nodeList[0].add(7);
		nodeList[0].add(8);
		nodeList[1] = new ListNode();
		nodeList[1].add(2);
		nodeList[1].add(4);
		nodeList[1].add(6);
		nodeList[1].add(9);
		nodeList[1].add(10);
		NodeA<Integer> node = nodeList[0].mergeList(nodeList);
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}
	
}
class ListNode<T>{
	public NodeA<T> head;
	public NodeA<T> tail;
	
	public ListNode(){
		this.head = null;
		this.tail = null;
	}
	
	public NodeA mergeList(ListNode[] list){
		NodeA<Integer> result = new NodeA(0);
		NodeA<Integer> head1 = result;
		NodeA<Integer> p = list[0].head;
		NodeA<Integer> q = list[1].head;
		
		while(p!= null && q!= null){
			if(p.data > q.data){
				result.next = q;
				q = q.next;
			}
			else if(p.data < q.data){
				result.next = p; 
				p = p.next;
			}
			else{
				result.next = p;
				p = p.next;
				result.next = q;
				q = q.next;
			}
			result = result.next;
		}
		if(p!= null){
			result.next = p;
		}
		if(q!= null){
			result.next = q;
		}
		return head1.next;
	}
	
	public void add(T data){
		NodeA<T> node  = new NodeA<T>(data);
		if(head == null){
			head = node;
			tail = head;
			return;
		}
		tail.next = node;
		tail = node;
		return;
		
	}
	
	
}
class NodeA<T>{
	T data ; 
	NodeA<T> next;
	
	public NodeA(T data){
		this.data = data;
		this.next = null;
	}
}