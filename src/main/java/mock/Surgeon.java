package mock;

public class Surgeon extends Doctor {
	private String name;
	
	public Surgeon(String st) {
		name = st;
	}
	
	public String getName() {
		return name;
	}
}
