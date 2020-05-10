
public class DoublyLinkListPaliendrom {

	public static void main(String[] args) {
		MyDDLinkList<Character> list = new MyDDLinkList();
		list.add('m');
		list.add('s');
		list.add('r');
		list.add('m');
		list.add('a');
		System.out.println(list.isPaliendrom());
	}

}
class MyDDLinkList<T>{
	NodeDD<T> head;
	NodeDD<T> tail;
	public MyDDLinkList(){
		head = tail =null;
	}
	public boolean isPaliendrom(){
		NodeDD<T> left = head;
		NodeDD<T> right = tail;
		if(head == tail){
			return true;
		}
		while(true){
			if(left.data != right.data){
				return false;
			}
			if(left.next == right.prev || (left.next == right && right.prev == left)){
				break;
			}
			left = left.next;
			right = right.prev;
		}
		
		return true;
	}
	public void add(T data){
		if(data == null){
			return;
		}
		NodeDD<T> newNode = new NodeDD(data);
		if(head == null && tail == null){
			head = newNode;
			tail = head;
		}else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
}
class NodeDD<T>{
	T data;
	NodeDD<T> next;
	NodeDD<T> prev;
	
	public NodeDD( T data){
		this.data = data;
		next = null;
		prev = null;
	}
	
}
