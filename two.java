package interfaces;


interface callback{
	void callme(int numb);
}

class client implements callback{
	public void callme(int numb ) {
		System.out.println(numb);
	}
}
public class two {
	public static void main(String...args) {
		
		callback c = new client();
		c.callme(1223243);
	}

}
