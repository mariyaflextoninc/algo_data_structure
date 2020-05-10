
public class TesttMyLinkList {
	/*Write a program to insert a sorted linked list
	Generic key
	O(n)*/

	    public static void main(String args[]){
	        MyLinkList<String> list  = new MyLinkList<String>();
	        list.insert("Kunjan");
	        list.insert("Kunji");
	        list.insert("Munnabi");
	        list.insert("poppi");
	        list.display();
	    }
}
class MyLinkList<T extends Comparable<T>> {


public MyLinkList(){
    root = null;
}
    Node<T> root;
    
static class Node<T extends Comparable<T>>{
    Node next ;
    T data ; 
    
    public Node(T data){
        
        this.data = data;
        this.next = null;
    }
    
    //public void compareTo(T data){
    //	this.data.compareTo(data);
    //}
}

public void insert(T data){

        Node<T> node = new Node<T>(data);
        if(root == null){
            root = node;
            return;
        }
        Node current = root;
        Node prev = null;
        while(current != null){
        
            if((current.data.compareTo(node.data )) > 0){
                 node.next = current;
                 if(prev == null){
                     root = node;
                     return;
                 }
                 prev.next = node;
                return;
            }
           
            prev = current;
            current = current.next;
        }
        prev.next = node;
        return;
}

public void display(){
    Node current = root;
    while(current != null){
        System.out.println(current.data+",");
        current = current.next;
    }
}
   
}

