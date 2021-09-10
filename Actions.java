package interfaces;
import java.util.Random;

interface SharedConstants{
	int NO = 0;
	int YES = 1;
	int MAYBE = 2;
	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
}

class question implements SharedConstants{
	Random rand = new Random();
	int ask() {
		int prob = (int) (100 * rand.nextDouble());
		if(prob < 30)
			return NO;
		else if (prob < 60)
			return YES;
		else if (prob < 75)
			return LATER;
		else if (prob < 98)
			return SOON;
		else
			return NEVER;
	}
}

class Actions implements SharedConstants{
	static void answer (int result) {
		switch(result) {
		case (NO):
			System.out.println(result + " NO");
			break;
		case (YES):
			System.out.println(result + " YES");
			break;
		case (LATER):
			System.out.println(result + " LATER");
			break;
		case (SOON):
			System.out.println(result + " SOON");
			break;
		case (NEVER):
			System.out.println(result + " NEVER");
			break;
		}
	}


	public static void main(String ...args) {
		question q = new question();
		
		answer(q.ask());
		
	}

}
