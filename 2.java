//=================================================================================================================//
//AUTHOR: BHAVANA BAFNA
//ROLL NO.: 23107
//BATCH:E9
//SUBJECT: OOP LAB
//TOPIC : ASSIGNMENT 2
//DESCRIPTION: PUBLICATIONS
//=================================================================================================================//
package oop_ass2;
import java.util.Scanner;

class Publications {

	// Data members in class publications:
	private String Title;
	private int price;
	private int copies;

	Publications() { // Default constructor of the class

		Title = "TITLE";
		price = 0;
		copies = 20;

	}
	
	Scanner sc = new Scanner(System.in);

	public String getTitle() {
	    return Title;
	  }
	
	public int getprice() {
	    return price;
	  }

	public int getcopies() {
	    return copies;
	  }
	
	public void setcopies(int newcopies) {
	    this.copies = newcopies;
	  }
	
	public void read() {

		// Taking input from the user about the book
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the book");
		Title = sc.nextLine();
		System.out.println("Enter the price of the book you want");
		price = sc.nextInt();
		System.out.println("Enter the number of copies available for the above book");
		copies = sc.nextInt();

	}

	public void display() {

		// Displaying the details of the book take from the user as an input
		System.out.println("TITLE: " + Title);
		//System.out.println("AUTHOR: "+ author);
		System.out.println("PRICE: " + price);
		System.out.println("COPIES: " + copies);
		
		
	}
	
	public void sellcopy() {

		System.out.println("Enter the number of copies you want to sell");
		int sell_copies = sc.nextInt();

		// Condition for keeping one copy with the owner itself
		if (sell_copies > (copies - 1)) {
			System.out.println("Insufficient number of copies requested.");
		} else {
			System.out.println("You have sold " + sell_copies + "copies");
			System.out.println("Total bill : " + "Rs. " + (sell_copies * price));
			copies = copies - sell_copies;
			System.out.println("Available copies now : " + copies);
		}
	}


}

class Book extends Publications {
	
	// Only data member author is made in this class
	String author;
	//Publications P = new Publications();  
    // object of the class Publications
	
	public void Read_books() {
		
		Scanner sc = new Scanner(System.in);
		read();
		System.out.println("Enter the name of the author of this particular book");
		author = sc.nextLine();
		
	}
	
	public void Display_books() {
		
		display();
		System.out.println("AUTHOR: " + author);
	}
	
	public void order_copies(int qty) {
		
		setcopies(getcopies()+qty);
		System.out.println("Number of copies ordered by you is: " + qty);
		System.out.println("Copies available at the store currently : "+ getcopies());

	}
	
	public void sellcopy(int q) {
		System.out.println("Total publication sell of book is : " + (q*getprice()));
		
	}
	
	

}

class Magazine extends Publications{
	
	int order_qty;
	String current_issue;
	//Publications P = new Publications();
	
	Magazine(){
		
		order_qty = 0;
		current_issue =  "DD/MM/YY";
	}
	
	Scanner sc =  new Scanner(System.in);
	
	public void read_Mg() {
		
		read();
		System.out.println("Enter the current month of magazine edition");
		current_issue = sc.nextLine();
		System.out.println("Enter the number of copies you want to order for this month");
		order_qty = sc.nextInt();
		setcopies(getcopies()+order_qty);

	}
	
	public void display_Mg() {
		
		display();
		display();
		System.out.println("Current month of issue of the magazine is : " + current_issue);
		System.out.println("ORDERED NO. OF COPIES: " + order_qty);
		System.out.println("Available copies in the stock are :" + (getcopies() + order_qty));

	
	}
	// receive issue for taking number of copies for new month
	public void recieve_issue() {

		sc.nextLine();
		System.out.println("Enter the month for the next issue of the magazine");
		current_issue = sc.nextLine();
		System.out.println("Enter the number of copies to be ordered for " + current_issue + "'s month ");
		order_qty = sc.nextInt();
		setcopies(order_qty);
	}

	

}



public class Publications_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qty, choice;
		Book B = new Book(); // object created for class Book
		Magazine M = new Magazine(); // object created for class Magazine
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the choice for which you want to check the data");
			System.out.println("1. Book");
			System.out.println("2. Magazine");
			choice = sc.nextInt();
		
		// Giving the user choice to check the data for:
		switch (choice) {
		case 1:
			int op;
			do {
				
				System.out.println("Enter from the following: ");
				System.out.println("1. Input");
				System.out.println("2. Display");
				System.out.println("3. Data about copies sold");
				System.out.println("4. Exit");
				op = sc.nextInt();

				switch (op) {
				case 1:
					B.Read_books();
					break;

				case 2:
					B.Display_books();
					break;

				case 3:
					B.sellcopy();
					break;
				
				case 4:
					break;
					
				default:
					System.out.println("Invalid input");
					break;
				}
			} while (op!=4);
			break;

		case 2:
			int s;
			do {
				System.out.println("Enter from the following: ");
				System.out.println("1. Input");
				System.out.println("2. Display");
				System.out.println("3. Data about new issue recieved");
				System.out.println("4. Exit");
				s = sc.nextInt();

				switch (s) {
				case 1:
					M.read_Mg();
					break;

				case 2:
					M.display_Mg();
					break;

				case 3:
					M.recieve_issue();
					M.display_Mg();
					break;
				case 4: 
					break;
				default:
					System.out.println("Invalid input!");
					break;
				}
			} while (s!=4);
			break;
		}
		
		}while(true);
	}

}
