import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {
	private static Comparator<NodeA<Integer>> comp = new Comparator<NodeA<Integer>>() {
		public int compare(NodeA<Integer> i1, NodeA<Integer> i2){
			return i1.data - i2.data;
		}
	};
	public static void main(String[] args) {
		LinkList1<Integer>[] nodeList = new LinkList1[3];
		nodeList[0] = new LinkList1<Integer>();
		nodeList[0].add(-1);
		nodeList[0].add(3);
		nodeList[0].add(5);
		nodeList[0].add(7);
		nodeList[0].add(8);
		nodeList[1] = new LinkList1<Integer>();
		nodeList[1].add(0);
		nodeList[1].add(4);
		nodeList[1].add(6);
		nodeList[1].add(9);
		nodeList[1].add(10);
		nodeList[2] = new LinkList1<Integer>();
		nodeList[2].add(-2);
		nodeList[2].add(-1);
		nodeList[2].add(0);
		nodeList[2].add(3);
		nodeList[2].add(6);
		MergeKSortedList obj = new MergeKSortedList();
		LinkList1<Integer> result= obj.mergeKSortedList(nodeList);
		NodeA<Integer> n = result.head;
		while(n!= null){
			System.out.println(n.data);
			n = n.next;
		}
		
	}
	
	public  LinkList1<Integer> mergeKSortedList(LinkList1<Integer>[] lists){
		
		if(lists.length == 0){
			return null;
		}else if(lists.length ==1){
			return lists[0];
		}
		LinkList1<Integer> mergedList = new LinkList1();
		PriorityQueue<NodeA<Integer>> pq = new PriorityQueue(lists.length,comp);
		for(int i =0; i <lists.length ;i++ ){
			pq.offer(lists[i].head);
		}
		while(!pq.isEmpty()){
			NodeA<Integer> n = pq.peek();
			mergedList.add(n.data);
			pq.poll();
			if(n.next!= null){
				pq.offer(n.next);
			}
		}
		return mergedList;
		
		
	}

}

class LinkList1<T>{
	NodeA<T> head;
	NodeA<T> tail;
	int size;
	
	public LinkList1(){
		head = null;
		tail = null;
		size = 0;
	}
	
	
	public void add(T data){
		NodeA<T> node = new NodeA(data);
		if(head == null && tail == null){
			head = node;
			tail = head;
		}
		else{
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	public int size(){
		return size;
	}
	
}

