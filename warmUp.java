import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "John";
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		user.nextLine();
		
		 if (user.nextLine() ==  name)
		 {
		     System.out.println("quitted");
		 }
		
		
		System.out.println("Enter your age");
		user.nextInt();
		System.out.println("What is your favorite color");
		user.next();
		System.out.println("What is the best number");
		user.nextInt();
		System.out.println("Thank you for your participation");
		
		 user.close();
		
	
		
		

	}

}
