package mock;

public class EJava {
	// LINE 1
	static String name;

	public EJava() {
		System.out.println(name);
	}

	void calc() {
		// LINE 2
		if (8 > 2) {
			System.out.println(name);
		}
	}

	public static void main(String... args) {
		// LINE 3
		System.out.println(name);
	}

}
