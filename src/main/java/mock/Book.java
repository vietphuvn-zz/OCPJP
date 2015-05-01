package mock;

public class Book {
	private String ISBN;

	public Book(String iSBN) {
		super();
		ISBN = iSBN;
	}
	
	public boolean equals(Object obj) throws RuntimeException {
		if (obj instanceof Book) {
			return ((Book) obj).ISBN == this.ISBN;
		}
		
		return false;
	}
}
