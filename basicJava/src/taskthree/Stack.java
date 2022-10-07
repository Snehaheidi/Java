package taskthree;

public class Stack {
	char A[];
	int top;
	int n;
	public Stack(){
		n=60;
		A = new char[n];
		top=-1;
	}
	public void push(int index) {
		if(top==n-1) {
			System.out.println("Stack is Full!!!");
			return;
		}
		A[++top]=(char) index;
	}
	public char pop() {
		if(top==-1) {
			System.out.println("Stack is Empty!!!");
			return '0';
		}
		
		char temp=A[top--];
		return temp;
	}
	public char peek() {
		if(top==-1) {
			//System.out.println("Stack is Empty!!!");
			return 0;
		}
		
		char temp=A[top];
		return temp;
	}
	public boolean contains(char c) {
		for(int i=0;i<=top;i++) {
			if(c==A[i]) {
				return true;
			}
		}
		return false;
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getStackSize() {
		return n;
	}
   public int getStackTop() {
	   return top;
   }
   public void print() {
	   for(int i=0;i<=top;i++) {
		   System.out.print(A[i]+" ");
	   }
   }
}
