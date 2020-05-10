import java.util.Comparator;

public class ObjectsComparator<T>  implements Comparator<T>{
	private String property;

	@Override
	public int compare(Object obj1, Object obj2) {
		Comparable obj1 = getComparable(obj1);
		Comparable obj2 = getComparable(obj2);
		return obj1.compareTo(obj2);
	
	}
	
	public Comparable getComparable(Object obj){
		if (!(obj instanceof Comparable)) {
			Comparable obj1 = (Comparable)obj.getClass().getMethod(property, new Class[]{}).invoke(obj,new Class[]{});
			return obj1;
		}
		return (Comparable) obj;
	}

}
