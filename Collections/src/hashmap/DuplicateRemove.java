package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateRemove {
	    private static char value;
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			HashMap<Character,Integer> list = new HashMap<>();
			String str = scanner.next();
	        int n = str.length();
	        for(int i=1;i<=n;i++) {
//	        	key = scanner.nextInt();
	        	value = str.charAt(i-1);
	        	list.put(value,i);
	        }
	        for(Map.Entry m : list.entrySet()) {
	        	System.out.println(m.getKey()+"  ");//+m.getValue());
	        }
	        scanner.close();
		}
}