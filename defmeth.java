package interfaces;


interface defeth{
	int getNumber();
	
	default String getString() {
		return "Defoult string";
	}
}

class myif implements defeth{

	
	public int getNumber() {
		
		return 100;
	}
	
}

public class defmeth{
	public static void main(String...args) {
		myif ob = new myif();
		System.out.println(ob.getNumber());
		System.out.println(ob.getString());
	}
	
}