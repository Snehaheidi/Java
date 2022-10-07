package evaluation;
import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	char[] s = str.toCharArray();
	for(int i=0;i<str.length()-1;i++) {
		if(s[i]!=s[i+1]) {
			if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U'){
//				temp = s[i] - 97;
//				count[temp]++;
				s[i] = '0';
			}
		}
		else{
			i++;
		}
	}
    for(int i=0;i<s.length;i++) {
    	if(s[i]!='0') {
    		System.out.print(s[i]);
    	}
    }
	scanner.close();
	}
}