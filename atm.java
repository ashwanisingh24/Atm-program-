package javaexempler;
import java.util.Scanner;

public class atm {
	public static void main(String[] args) {
		int balance=50000;
		String lasttransaction ="no trancation made";	
		int pin = 7439;
		
		Scanner xyz= new Scanner(System.in);
		System.out.println("ENTER YOUR PIN");
		int enteredpin=xyz.nextInt();
		if (enteredpin!=pin) {
			System.out.println("entered pin is wrong");
			return ;
		}
		System.out.println("WELCOME USER");
		while(true) {
			System.out.println("1.WITHDRAW CASH");
			System.out.println("2.DEPOSIT CASH");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4.VIEW LAST TRANSACTION");
			System.out.println("5.EXIT");
			System.out.print("ENTER YOUR CHOICE:");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1://withdraw
				System.out.println("enter the amount you want to withdraw");
				int withdraw=xyz.nextInt();
				if ( withdraw>0 && withdraw<=balance) {
					balance-=withdraw;
					lasttransaction = "You withdrew: Rs." + withdraw;
					System.out.println("Withdrawal successful! Please take your cash.\n");
				}
				else if (withdraw>balance)
					System.out.println("Insufficien balance\n");
				else 
					System.out.println("invalid attempt\n");
				break;
				
			case 2://deposit
				System.out.print("enter the amount you want deposit");
				int deposit=xyz.nextInt();
				if(deposit>0)
				{
					balance+=deposit;
					lasttransaction="you deposited rs."+deposit;
					System.out.print("the AMOUNT has been updated");
		
				}
				else
					System.out.println("WInvalid attempt\n");
				
				break;
			case 3:
	               // Displaying balance
	               System.out.println("Your current balance is: Rs." + balance+"\n");
	               break;
	               
			 case 4:
	               // Displaying last transaction
	               System.out.println("Last transaction: " + lasttransaction+"\n");
	               break;
	            case 5:
	               // Exit the program
	               System.out.println("Thank you for using the ATM. Have a great day!\n");
	               System.exit(0);
	               break;
	               default:
	            	   System.out.println("Invalid choice. Please select a valid option.\n");
				
				
				
			}
			
			
			
			
			
			
		}
		
		}

}
