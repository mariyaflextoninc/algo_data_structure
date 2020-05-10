import java.util.Arrays;

public class MyArrayList<T> {
	private Object[] myStore;
	private int size;
	private static final int defaultCap = 10;
	
	public MyArrayList(){
		myStore = new Object[defaultCap];
		size = 0;
	}
	
	public void add(T data){
		if((size - myStore.length) <= 5){
			increaseSize();
		}
		myStore[size++] = data;
	}
	
	public T remove(int index){
		T elem  = null;
		if(index < size){
			int temp = index;
			elem = (T)myStore[index];
			myStore[index] = null;
			while(temp < size){
				myStore[temp] = myStore[temp+1];
				myStore[temp+1] = null;
				temp++;
			}
			size--;
		}else{
			throw new IndexOutOfBoundsException();
		}
		return elem;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index){
		T elem  = null;
		if(index < size && index > 0){
			elem =(T)myStore[index];
		}else{
			throw new IndexOutOfBoundsException();
		}
		return elem;
	}
	
	public void increaseSize(){
		myStore = Arrays.copyOf(myStore, myStore.length*2);
	}
	@Override
	public String toString(){
		StringBuffer str = new StringBuffer();
		int i =0;
		while(i<size){
			str.append(myStore[i]);
			str.append(", ");
			i++;
		}
		return str.toString();
	}
}
