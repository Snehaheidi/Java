package taskthree;

import java.util.Scanner;

public class RemoveDuplicateLexicoGraphical{

	public static void main(String[] args) {
 
	Stack stack=new Stack();
	Scanner in=new Scanner(System.in);
	//String sen=in.next();
	String sen="cbaabc";
	int n=sen.length();
	char A[] = sen.toCharArray();
	//S INPUT : 
	int lastIndexPostion[]=new int[26];
	int index = 0;
     in.close();
	//FIND LAST INDEX POSITION:
	
	for(int i=0;i<n;i++) {
		
		index = findIndex(A[i]);
		lastIndexPostion[index] = i;	
		//System.out.println(Arrays.toString(lastIndexPostion));
	}
	// True or False 
	boolean[] stackElement = new boolean[stack.getStackSize()];
	
	//Algorithm 	
	
	/*
 *      for (int i = 0; i < s.length(); i++) {
           
           int curr = s.charAt(i) - 'a';
            
               if (seen[curr]) continue; // if seen continue as we need to pick one char only
            
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
           
            seen[st.pop()] = false; // pop out and mark unseen
        }
        
        st.push(curr); // add into stack
        
        seen[curr] = true; // mark seen
        }*/
	/*-------------------------------------------------------------------------*/
	for(int i=0;i<n;i++) {
		
		index=findIndex(A[i]);
		
		//ALREADY INSERTED OR NOT IN STACK --> IF TRUE --> CONTINUE
		if(stackElement[index]) {
			continue;
		}
		//3->Condition:
		while(!stack.isEmpty() && stack.peek() > index && i < lastIndexPostion[stack.peek()]) {
			
			stackElement[stack.pop()]=false;
		} 
		stack.push(A[i]);
		stackElement[findIndex(A[i])]=true;
	}	
	/*-------------------------------------------------------------------------*/
	/*for(int i=0;i<n;i++) {
		if(stack.isEmpty()) {
			stack.push(A[i]);
			stackElement[findIndex(A[i])] = true; 
		}
		else if(A[i]<stack.peek() && lastIndexPostion[findIndex(stack.peek())] > i) {
			char c = stack.pop();
			stackElement[findIndex(c)] = false;
			stack.push(A[i]);
			stackElement[findIndex(A[i])] = true;
		}
		else {
			System.out.println(i);
		}
	}*/
	stack.print();
 }
	public static int findIndex(char c) {
		int temp =(int) c;
		return temp - 97;
	}
}