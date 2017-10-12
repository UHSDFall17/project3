import java.util.Scanner;

public class Login {

	
	public static void DisplayLogin(){
		String UsernameInput;
		String PasswordInput;
		System.out.println("Enter Usermame: " );
		Scanner userName = new Scanner(System.in);
		UsernameInput = userName.nextLine();
	    System.out.println("Enter Password: " );
	    Scanner password = new Scanner(System.in);
	    PasswordInput = password.nextLine();

	    
	}
	
	
	public static void main(String[] args){
		
		DisplayLogin();
		
	}
}
