package mock;

public class RocketScience {
	char ace;
	
	public static void main(String[] args) {
		int a = 0;
		
		while (a == a++ && a < 4) {
			a++;
			System.out.println(a);
		}
		
		System.out.println("________________");
		
		int b = 0;
		for (;b < 4; b = b + 1) {
			System.out.println(b);
		}
		
		System.out.println("________________");
		
		RocketScience rs = new RocketScience();
		System.out.println(rs.ace); // will print null character
		
		System.out.println("________________");
		
		int i = 1;
		System.out.println(i++ + ++i + ++i);
		i = 1;
		System.out.println(++i * i++ + i++);
		
		System.out.println("________________");
		int x = 10;
		int y = 20;
		int z = 30;
		System.out.println(x + y % z);
		System.out.println(x + (-y) * (-z));
		
		if (x + y % z > x + (-y) * (-z)) {
			System.out.println(true);
		}
		
		System.out.println("________________");
		int[] myArr = new int[] {};
		int[] myArr1 = new int[] {};
		System.out.println(myArr);
		System.out.println(myArr1);
		System.out.println(myArr == myArr1);
		// myArr[0] = 1;
	}

}
