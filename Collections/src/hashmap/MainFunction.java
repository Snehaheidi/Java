package hashmap;

import java.util.*;

public class MainFunction {
    private static int key;
    private static String value;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer,String> list = new HashMap<>();
        int n = scanner.nextInt();
        for(int i=0;i<n;i++) {
        	key = scanner.nextInt();
        	value = scanner.next();
        	list.put(key, value);
        }
        for(Map.Entry m : list.entrySet()) {
        	System.out.println(m.getKey()+"  "+m.getValue());
        }
        scanner.close();
	}
}