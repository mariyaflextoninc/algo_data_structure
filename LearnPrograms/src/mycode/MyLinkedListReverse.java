package mycode;

public class MyLinkedListReverse<K,T> {
	MyLList<K,T> head;
	MyLList<K,T> tail;
	
	public void add( T value,K key){
		if(key == null || value == null){
			return;
		}
		MyLList<K,T> node = new MyLList<K,T>(value,key);
		if(head == null){
			head = node;
		}
		else{
			tail.next = node;
			tail = node;
		}
	}
	
	public void reverseList(){
		
	}
	
	public void reverseL(){
		
	}
	
	public void remove(K key){
		if (key == null){
			return;
		}else{
			MyLList<K,T> curr = head;
			MyLList<K,T> rev = null;
			while(curr != null){
				if(curr.key == key){
					if(rev == null){
						head = head.next;
						curr = null;
						return;
					}
					rev = curr.next;
					curr = null;
					return;
				}
				rev = curr;
			}
		}
		
	}
	
}

 class MyLList<K,T> {
	 MyLList<K,T> next;
	 T value;
	 K key;
	 public  MyLList(T data1, K data2){
		 this.key = data2;
		 this.value = data1;
		 this.next = null;
	 }
}
