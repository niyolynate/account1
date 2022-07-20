import java.util.Scanner;

public class Account {
//Class Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	//Class constructor
	
  Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}
//Function for Depositing money
	void diposit(int amount){
		if (amount!=0){
			balance = balance - amount;
			previousTransaction = amount;
		}
		}
	//Function for withdrawing money
	void withdraw(int amount){
		if (amount!=0){
			balance = b;
			System.out.printLn("Welcome, " +customer + "!");
	}
	//Function showing the previous transaction
	void getPreviousTransaction(){
		if(previousTransaction > 0){
		System.out.println("Deposited: " + previousTransaction));
		} else {
		System.out.println("No transaction occured";)}
	}

//Function calclating interest of current	funds after a number of years
void calculatinterest(int years) {
	double interestRate = .018;
    double newBalance = (balance + interestRate + years) + balance;
	System.out.println("After" + years +"years, you balance will be: " + "%");
	System.out.println(After " + years, you balance will be: " +newBalance);
	 }
}
     //Function showing the main menu
void showMenu( {
	char option = '\0';
	Scanner scanner = new Scanner(System.in) 
System.out.println("Welcome, "+ customerName + "!");
	System.out.println("Your ID is: "+ customerID);
	System.out.println();
	System.out.println("What would you like to do?");
	System.out.println("B. Make a deposit");
	System.out.println("C. Make a withdrawal");
	System.out.println("D. View previous transaction");
    System.out.println("E. Calculate interest");
    System.out.println("F. Exit");
      
    do{
    	System.out.println();
    	System.out.println("Enter an option: ");
    	char option1 = scanner.next().charAt(0);
    	option = Character toUpperCase(option);
    	System.outprintln();
    	
    	switch(option) {
    	//Case 'A' allows the user to check their account 
    	case 'A':
    	System.out.println("=====================================");
    	System.out.println("Balance = $" + balance);
    	System.out.println("=====================================");
        break;
        
        //Case 'B' allows the user to deposit money into their account
        case 'B':
        System.out.println("Enter an amount to deposit: ");
        int amount2 = scanner.nextint();
        deposit(amount2);
        System.out.println();
        break;
        
        //Case 'C' allows the user to withdraw money using..
        case 'C':
        System.out.println("Enter an amount withdraw: ");
        int amount2 = scanner.nextint();
        withdraw(amount2);
        System.out.println();
        
      //Case 'D' allows the user to view the most recent transaction. 
    	case 'D':
    	System.out.println("=====================================");
        getPreviousTransaction();
    	System.out.println("=====================================");
        break;
        
        //Case 'E'calculate the accrued interest after a number of years.
        case 'E':
        System.out.println("Enter how many years of accrued interest: ");
        int years = scanner.nextint();
        calculateInterest(years);
        break;
         
        //Case'F' exits the user from their account.
        case 'F':
    	System.out.println("=====================================");
        break;
    	}
    	default(System.outprintln("Error: invalid option. Please enter A,B,C,D,E,F");
    	break;
    }
} while(option != 'F');
System.out.println("Thank you for Banking with us!");
}
}

