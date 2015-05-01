package mock;

public class TestPhones {

	public static void main(String[] args) {
		Phone phone = new Phone();
		Phone smartPhone = new SmartPhone();
		phone.call();
		smartPhone.call();
		SmartPhone sp = (SmartPhone) smartPhone;
		sp.call();
		
		//String eVal = "123456789";
		//System.out.println(eVal.substring(eVal.indexOf("2"),eVal.indexOf("0")).concat("0")); // String index out of range: -2
		
		StringBuilder sb = new StringBuilder(5 * 3);
		sb.append("Exception in thread main java.lang.StringIndexOutOfBoundsException");
		System.out.println(sb);
		
		sb.insert(2, 2 + 2);
		System.out.println(sb);
	}

}
