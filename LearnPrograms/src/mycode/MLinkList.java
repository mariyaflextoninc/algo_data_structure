package mycode;

import java.util.Iterator;
import java.util.List;

/*public class LinkedList {

	public static void main(String[] args) {
		MLinkList<Integer> list = new MLinkList();
		list.add(12);
		list.add(13);
		list.add(4);
		list.add(14);
		list.add(8);
		list.display();
		list.sort();
		System.out.println("\n\nsorted ");
		list.display();
	}
	

}*/
public class MLinkList<T extends Comparable<T>> implements Iterable<T> {
	NodeL<T> tail;
	NodeL<T> head;
	int size;
	

public void reverseList(NodeL node){
    NodeL prev = null;
    NodeL curr = node;
    while(curr != null){
          NodeL temp =   curr.next;
          curr.next = prev;
          prev = curr;
          temp.next = curr;
          curr = curr.next;
    }
}
public NodeL reversRecursionList(NodeL head){//1,2,3,4
	//4
	if(head.next == null){
		return head;
	}
	
	
	//NodeL second = head.next;//2
	//head.next = null;//1
	NodeL second = head.next;
	head.next = null;
	
	NodeL rest = reversRecursionList(second);
	
	rest.next = head;
	
	//second.next = head;
	return rest;
}

	public void sort() {
		MLinkList<T> sortedList =  new MLinkList();
		
		while(head != null){
			NodeL<T> curr = head;
			head = curr.next;
			curr.next = null;
			
			NodeL<T> start = sortedList.head;
			NodeL<T> prev = null;
			
			if (start == null) {
				sortedList.head = curr;
			} else {
				while (start != null) {
					if (start.data.compareTo(curr.data) > 0){
						if (prev == null) {
							sortedList.head = curr;
						} else {
							prev.next = curr;
						}
						curr.next = start;
						curr = null;
						break;
					 }
					 
					 prev = start;
					 start = start.next;
				}
					      
				if (curr != null) {
				    prev.next = curr;
				}
		    }		     		   
		}
		
		this.head = sortedList.head;
	}
	
	public MLinkList(){
		tail = head =null;
		size =0;
	}
	
	public void add(T data){
		NodeL<T> node = new NodeL(data);
		if(tail == null){
			head = node;
			tail = head;
			size++;
			return;
		}
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void display(){
		NodeL<T> temp = head;
		while(temp != null){
			System.out.println(temp.data+"--> ");
			temp = temp.next;
		}
	}
	
	public int getSize(){
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		Iterator obj =  new Iterator<T>(){
			NodeL<T> newHead = head;
			MLinkList<T> list1 = new MLinkList();
			list1.add(head.data);
			private int position =0;
			private NodeL<T> cursor = head.next;
			
			public boolean hasNext(){
				if(position < size){
					return true;
				}
				return false;
			}
			public T next(){
				return cursor.next.data;
			}
			@Override
			public void remove() {
				
			}
			
		};
		return obj;
	}
}
class NodeL<T>{
	T data;
	NodeL<T> next;
	
	public NodeL(T data){
		this.data = data;
		this.next = null;
	}
}
