package interfaces;

interface AA {
	void m1();
	void m2();
}

interface BB extends AA{
	void m3();
}

class myclass implements BB{
	public void m1() {
		System.out.println("Implementations M1");
	}
	
	public void m2() {
		System.out.println("Implementations M2");
	}

	public void m3() {
		System.out.println("Implementations M3");
	}
}






public class Infaces {
	public static void main(String...args) {
	myclass yeah = new myclass();
	yeah.m1();
	yeah.m2();
	yeah.m3();
	}
}
