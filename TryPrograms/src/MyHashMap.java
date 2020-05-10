
public class MyHashMap<K,V> {
	private int initCapcity;
	private int hash;
	private Entry<K, V> table[];
	static class Entry<K,V>{
		private K key; 
		private V value;
		private Entry<K, V> next ;
		
		public Entry(K key, V value){
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	/**
	 * Put a key value pair in hash map
	 */
	public void put(K key, V value){
		if(key == null){
			return;
		}
		Entry<K, V> entry = new Entry<K,V>(key, value);
		hash = hash(key);
		if(table[hash] == null){
			table[hash]  = entry;
			return;
		}
		
		Entry current = table[hash];
		Entry previous = null;
		while(current != null){
			if(current.key.equals(key)){// dealing with duplicates
				if(previous == null){
					entry.next = current.next;
					table[hash] = entry;
					return;
				}else{
					previous.next = entry;
					entry.next = current.next;
					return;
				}
			}
			
			previous = current;
			current = current.next;
		}
		previous.next = entry;
	}
		
	/**
	 * Remove an element form the hash map
	 */
	public boolean remove(K key){
		hash = hash(key);
		if(table[hash] == null){
			return false;
		}
		Entry<K, V> current = table[hash];
		Entry<K, V> previous = null;
		while(current != null){
			if(current.key.equals(key)){
				if(previous == null){
					table[hash] = current.next;
					return true;
				}else{
					previous.next = current.next;
					return true;
				}
			}
			previous = current;
			current = current.next;
		}
		return false;
	}
	/**
	 * Display all elements from the hash map
	 */
	public void display(){
		int i = 0;
		while(i < table.length){
		 Entry<K, V> entry = table[i];
		 while(entry != null){
			 System.out.println("key = "+entry.key+"value = "+entry.value);
			 entry = entry.next;
		 }
			i++;
		}
		
	}
	/**
	 * retrieve value by key
	 */
	public void get(){
		
	}
	/**
	 * get hash of key
	 */
	public int hash(K key){
		return Math.abs(key.hashCode());
	}
}
