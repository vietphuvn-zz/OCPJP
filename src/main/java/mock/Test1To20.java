package mock;

public class Test1To20 {

	public static void main(String[] args) {
        try {
        	 String[] names = {"Ann", "Mike"};
        	 System.out.println (names[1].substring(0, 2));
    	} catch (ArrayIndexOutOfBoundsException e) {
    		System.out.println(1);
    	} catch (NullPointerException e) {
			System.out.println(2);
		}
        
        int a = 10; String name = null;
        try {
	         a = name.length();
	         a++;
        } catch (NullPointerException e) {
        	++a;
        }
        System.out.println(a);
        
        int x = 10;
        
        switch (x) {
        	default: System.out.println("Not match");
        	case 2: System.out.println("2");
		}
        
        int b = 10;
        
        for (; b <= 20; b++) {
        	if (b % 3 == 0) {
        		b++;
        	} else if (b % 2 == 0){
        		b *= 2;
//        		b += 10;
        	}
        	
        	System.out.println(b);
        }
        
        System.out.println("jump out for loop, now b is " + b);
        
        int c = 10; // 01010
        System.out.println(c ^ 7);
        
        String[][] twoMesionArray = new String[2][3];
        
        twoMesionArray[1][2] = "A";
        
        for (int i = 0; i < twoMesionArray.length; i++) {
        	for (int j = 0; j < twoMesionArray[i].length; j++) {
        		System.out.print(twoMesionArray[i][j] + " ");
        	}
        	System.out.println();
        }
        
        // will compile but will throw RuntimeException at runtime
        // Roamble roam = (Roamble) new Phone();
        
        StringBuffer sb = new StringBuffer("Lion");
        System.out.println(checkReturnInTryCatch(8));
        
        try {
        	new Father().dance();
        } finally {
        	
        }
        
        String[] sst = {null};
        
        System.out.println(sst[0]);
	}
	
	public static String checkReturnInTryCatch(int x) {
		String ret = "catch";
		
		try {
			x = x / 0;
		} catch (Exception e) {
			return ret;
		} finally {
			ret = "A";
		}
		
		return null;
	}
}
