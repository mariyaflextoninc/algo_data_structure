import java.util.Arrays;

public class ImplementArrayListDemo {

	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList();
		list.add(12);
		list.add(13);
		list.add(15);
		System.out.println(list.toString());
	}

}