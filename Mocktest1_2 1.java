//=================================================================================================================//
//AUTHOR: BHAVANA BAFNA
//ROLL NO.: 23107
//BATCH:E9
//SUBJECT: OOP LAB
//TOPIC : MOCK 1
//DESCRIPTION: /*Write a Java program to convert seconds to hour, minute and seconds.Create class and use parameterized
//               constructor for the same.*/
//=================================================================================================================//
package mock1;
import java.util.Scanner;

//class created
class Time1{
	public int p1,p2,p3;
//Default constructor
	Time1(){
	      
	   }
//Parameterized constructor with three integer arguments
	   Time1(int i, int j, int k){
	       this.p1=i;
	       this.p2=j;
	       this.p3=k;
	   }
void input() {
	Scanner in = new Scanner(System.in);
	// enter the seconds here.
	System.out.print("Enter seconds : ");
  //user input of seconds
	int seconds = in.nextInt(); 
	if(seconds > 0)
  {
      System.out.println("Seconds is "+seconds);
  }
  else if(seconds < 0)
  {
      System.out.println(seconds +" is invalid");
  }
  //seconds conversion to hh:mm:ss
	p1 = seconds % 60;
	p2 = seconds / 60;
	p3 = p2 % 60;

	p2 = p2 / 60;
}

//receive issue for taking number of copies for new month
void display() {
	//display exact time
	System.out.print("HH:MM:SS - " +p2 + ":" + p3 + ":" + p1);
	System.out.print("\n");
}
}
//main class created
public class Mocktest1_2
{
	public static void main(String[] args)
	{
		Time1 T = new Time1();
		// create object of scanner class.
		Scanner in = new Scanner(System.in);
      int choice;
		// Giving the user choice to check the data for:
	int op;
			do {
				System.out.println("Enter from the following: ");
				System.out.println("1. Input");
				System.out.println("2. Display");
				System.out.println("3. Exit");
				op = in.nextInt();

				switch (op) {
				case 1:
				    T.input();
				    break;

				case 2:
					T.display();
					break;
					
				case 3:
					System.out.println("program finished!!");
					break;

				default:
					System.out.println("Invalid input");
					break;
				}
			}
				
			while (op!=3);		
	}  
}
//program finished!!

//===========================output==========================
//Enter from the following: 
//1. Input
//2. Display
//3. Exit
//1
//Enter seconds : -900
//-900 is invalid
//Enter from the following: 
//1. Input
//2. Display
//3. Exit
//1
//Enter seconds : 4500
//Seconds is 4500
//Enter from the following: 
//1. Input
//2. Display
//3. Exit
//2
//HH:MM:SS - 1:15:0
//Enter from the following: 
//1. Input
//2. Display
//3. Exit
//3
//program finished!!
//============================================================