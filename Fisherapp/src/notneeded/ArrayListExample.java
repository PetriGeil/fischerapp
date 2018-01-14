package notneeded;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();

		test.add("Zürichsee");
		test.add("Bodensee");
		test.add("Greifensee");

		for (Object object : test) {
			System.out.println(object);
		}
		System.out.println("-------");
		test.remove("Bodensee");
		for (Object object : test) {
			System.out.println(object);
		}

	}
}
