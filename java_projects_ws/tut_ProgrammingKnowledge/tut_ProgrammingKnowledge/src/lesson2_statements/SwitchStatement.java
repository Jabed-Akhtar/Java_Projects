package lesson2_statements;

public class SwitchStatement {

	public static void main(String[] args) {
		int score = 85;
		
		switch (score)
		{
		case 90:
			System.out.println("It's 90");
			break;
		case 85:
			System.out.println("It's 85");
			break;
		default:
			System.out.println("It's none");
			break;
		}
	}
}
