import java.util.ArrayList;

public class HalloWelt {
	public static void main(String[] args) {
		HalloWelt test = new HalloWelt();

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
