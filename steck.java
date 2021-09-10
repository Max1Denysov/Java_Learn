package interfaces;
interface IntSteck{
	void push(int item);
	int pop();
}

class fixedS implements IntSteck{
	private int stck[];
	private int LastElNumb;
	fixedS(int size){
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
class DynamicS implements IntSteck{
	private int stck[];
	private int LastNumb;
	DynamicS(int size){
		stck = new int[size];
		LastNumb = -1;
	}
	public void push(int item) {
		if(LastNumb == stck.length - 1) {
			int temp[] = new int[stck.length * 2];
			for(int i = 0;i<stck.length;i++) {
				temp[i] = stck[i];
				stck = temp;
				stck[++LastNumb] = item;
			}
		 
		}
		else {
			stck[++LastNumb] = item;
		}
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
	

class myWord{
	
	private String []stck;
	private int Last;
	myWord(int size){
		stck = new String [ size];
		Last = -1;
	}
	
	
	public void push(String[] arr) {
		if (Last == stck.length -1) {
			System.out.println("Full Stack");
		}
		else {
			stck[++Last] = arr[Last];
		}
	}
	
	public String pop() {
		if(Last < 0) {
			System.out.println("Empty stack");
			return "Steck empty";
		}
		else {
			return stck[Last--];
		}
	}
	
	
	
}







public class steck {
	static String arr[] = {"one","two","three","apple","fruit","banana","Cherry"};
	public static void main(String...args) {
		fixedS mysteck1 = new fixedS(20);
		DynamicS mysteck2 = new DynamicS(50);
		myWord mysteck3 = new myWord(6);
		IntSteck mystack;
		
		mystack = 
		for(int i = 0; i < 20; i++) {
			mysteck1.push(i);
		}
		
		for(int i = 0; i < 50; i++) {
			mysteck2.push(i);
		}
		
		for(int i = 0; i < 8; i++) {
			mysteck3.push(arr);
		}
		
		
		System.out.println("Stack One Have: ");
		for(int i = 0;i<20;i++) {
			System.out.print(mysteck1.pop() + " ");
		}
		
		
		System.out.println("\nStack Two Have: ");
		for(int i = 0;i<50;i++) {
			System.out.print(mysteck2.pop() + " ");
		}
		
		System.out.println("\nStack Three Have: ");
		for(int i = 0;i<8;i++) {
			System.out.print(mysteck3.pop() + " ");
			
		}
		
		
		
		
		
		
		
		
	}

}
