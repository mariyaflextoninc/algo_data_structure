import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final public class ImmutableClass {
	final private String id;
	final private String name;
	final HashMap<String, String> testMap;
	public ImmutableClass(String id, String name, HashMap<String, String> hm){
		this.id = id;
		this.name = name;
		//this.testMap = hm;// shallow copy
		HashMap<String,String> tempHM = new HashMap();
		Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> obj = itr.next();
			//System.out.println(itr.next().getValue());
			tempHM.put(obj.getKey(), obj.getValue());
		}
		testMap = tempHM;
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}

	
	

}
