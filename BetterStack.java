package interfaces;
interface MIntSteck{
	void push(int item);
	int pop();
}

class fixed implements MIntSteck{
	private int stck[];
	private int LastElNumb;
	fixed(int size){
		stck = new int[size];
		LastElNumb = -1;
	}
 
	public void push(int item) {
		if (LastElNumb == stck.length -1) {
			System.out.println("Full Stack");
		}
		else {
			stck[++LastElNumb] = item;
		}
	}
	
	public int pop() {
		if(LastElNumb < 0) {
			System.out.println("Empty stack");
			return 0;
		}
		else {
			return stck[LastElNumb--];
		}
	}
	
	
	
	
}
class Dynamic implements MIntSteck{
	private int stck[];
	private int LastNumb;
	Dynamic(int size){
		stck = new int[size];
		LastNumb = -1;
	}
	public void push(int item) {
		if(LastNumb == stck.length - 1) {
			int temp[] = new int[stck.length * 3];
			for(int i = 0;i<stck.length;i++) temp[i] = stck[i];
				stck = temp;
				stck[++LastNumb] = item;
		
		
		}
		else 
			stck[++LastNumb] = item;
}
	
	public int pop() {
		if(LastNumb < 0 ) {
			System.out.println("Empty Stack");
			return 0;
		}
		else {
			return stck[LastNumb--];
		}
	}
}
	





public class BetterStack {
	public static void main(String...args){
		MIntSteck  mystack;
		fixed myF = new fixed(9);
		Dynamic myD = new Dynamic(12);
		
		mystack = myF;
		for(int i = 0;i < 9;i++) mystack.push(i);
		
		mystack = myD;
		for(int i = 0;i < 21;i++) mystack.push(i);
		
		mystack = myF;
		System.out.println("Fixed Stack: ");
		for(int i = 0;i < 9;i++)
			System.out.print(mystack.pop() + " ");
		
		
		mystack = myD;
		System.out.println("\nDynamic Stack: ");
		for(int i = 0;i < 21;i++)
			System.out.print(mystack.pop() + " ");
		
		
		
	}
}
