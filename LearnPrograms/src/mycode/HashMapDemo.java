package mycode;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyHMap<K,V>{
	private Entry<K,V>[] table;
	private int initialCapacity;
	
	static class Entry<K, V>{
		private K key;
		private V value;
		private Entry<K,V> next;
		
		public Entry(K key , V value){
			this.key = key;
			this.value = value;
			this.next = null;
		}
		
	}
	
	public void put(K key , V value){
		Entry<K,V> newEntry = new Entry(key,value);
		int index = getHash(key);
		if(table[index] == null){
			table[index] = newEntry;
			return;
		}
		Entry<K,V> current = null;
		Entry<K,V> previous = null;
		while(current != null){
			if(current.key.equals(key)){
				current.value = value;
				return;
			}
			else{
				previous = current;
				current = current.next;
			}
		}
		previous.next = newEntry;
	}
	
	public boolean remove(K key){
		Entry<K,V> current = null;
		Entry<K,V> previous = null;
		int index = getHash(key);
		if(table[index] == null){
			return false;
		}
		current = table[index];
		while(current != null){
			if(current.key.equals(key)){
				if(previous == null){
					table[index] = current.next;
					current = null;
					return true;
				}else{
					previous.next = current.next;
					current = null;
					return true;
				}
				
			}
			previous = current;
			current = current.next;
		}
		return false;
	}
	
	public int getHash(K key){
		return Math.abs(key.hashCode() % initialCapacity);
	}
}
