package mock;

class Whale {

	public static void main(String[] args) {
		boolean hungry = false;
		
		while (hungry = true) {
			Fish.count++; // infinite loop
		}
		
		System.out.println(Fish.count);
	}

}
