package mock;

public class TwistInTaleNullPointerException {

	public static void main(String[] args) {
		String[][] oldLaptops = {
				{"Dell", "Toshiba", "Vaio"},
				null,
				{"IBM"},
				new String[10]
		};
		
		System.out.println(oldLaptops[0][0]);
		System.out.println(oldLaptops[1]);
		System.out.println(oldLaptops[3][6]);
		//System.out.println(oldLaptops[3][0].length());
		System.out.println(oldLaptops);
		
		int i = 2_3;
		float d = 54.0_34_____4f;
		System.out.println(i);
		System.out.println(d);
		System.out.println(Integer.parseInt("0011", 2));
		System.out.println(Byte.parseByte("-128"));
	}
}
