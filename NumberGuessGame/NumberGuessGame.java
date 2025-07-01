import java.util.Scanner;
public class NumberGuessGame {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String playagain;
		do {
		int sys_guess=(int)(Math.random()*10);
		int attempts=5;
		System.out.println("system has chosen a number between 0 and 9");
		while(attempts<=5) {
		System.out.println("enter the user guess number:");
		int user_guess=sc.nextInt();
		attempts++;
		if(sys_guess==user_guess) {
			System.out.println("user has guessed correctly");
			break;
		}
		else if(user_guess<sys_guess) {
			System.out.println("too low");
		}
		else {
			System.out.println("too high");
		
		}
		
		if(user_guess!=sys_guess) {
			System.out.println("sorry the correct answer is:"+sys_guess);
		}
		}
		System.out.println("do you want to play again=y/n");
		  playagain=sc.next();
		}
      while(playagain.equalsIgnoreCase("y"));
	System.out.println("thank you for playing");
		}
}
