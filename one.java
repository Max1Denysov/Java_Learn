package interfaces;

class A{
	public interface NedtedIf{
		boolean isequal(int x);
	}
}

class B implements A.NedtedIf{
	public boolean isequal(int x) {
		return x < 0 ? false : true;
	}
	
}



public class one {
	public static void main(String...args) {
		A.NedtedIf nif = new B();
		if(nif.isequal(10)) {
			System.out.println("10 > 0");
		}
		if(nif.equals(-12)) {
			System.out.println("-12 < 0");
		}
	}

}
