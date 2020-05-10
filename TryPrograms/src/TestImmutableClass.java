import java.util.HashMap;

public class TestImmutableClass {

	public static void main(String[] args) {
		HashMap<String , String> hm = new HashMap();
		hm.put("Mariya", "1");
		hm.put("Tomy", "2");
		hm.put("Deepa", "3");
		hm.put("Nair", "4");
		String id  = "my";
		String name = "name";
		ImmutableClass obj = new ImmutableClass(id,name, hm);
		System.out.println(id==obj.getId());
		System.out.println(name == obj.getName());
		System.out.println("----------------------");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getTestMap());
		System.out.println("----------------------");
		
		id = "Test";
		name = "Changed";
		hm.put("Febin", "Tomy");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getTestMap());
		System.out.println("----------------------");
	}
	

}
