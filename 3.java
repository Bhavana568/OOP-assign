//=================================================================================================================//
//AUTHOR: BHAVANA BAFNA
//ROLL NO.: 23107
//BATCH:E9
//SUBJECT: OOP LAB
//TOPIC : ASSIGNMENT 3
//DESCRIPTION: EMPLOYEE
//=================================================================================================================

package employee;
import java.util.Scanner;

//parent class
class Employee {

	// data members of Employee class
	String Emp_name ;
	String address;
	String mail_id;
	int Emp_id;
	long mob_no;
	
	// Constructor:
	Employee() {
		Emp_name = "Name";
		Emp_id = 1;
		mail_id = ".........@gmail.com";
		mob_no = 0;
		address = "abcdefgh";

	}
	
	int basic_pay;//declaring variable for BP
	double DA, HRA, PF, SCF, net_salary, gross_salary;//other factors declared


	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the employee:");//input for name
		Emp_name = sc.nextLine();
		System.out.println("Enter the Id of the employee:");//input for ID
		Emp_id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the address of  the employee:");//input for address
		address = sc.nextLine();
		System.out.println("Enter mobile number:");//input for mobile no
		mob_no = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the employee's mail id :");//input for email
		mail_id = sc.nextLine();

	}

	public void display() {
		
		//display function to display all details
		System.out.println("========================================================================");
		System.out.println("Employee name ::\t\t\t" + Emp_name);
		System.out.println("Employee ID :: \t\t\t\t" + Emp_id);
		System.out.println("Address :: \t\t\t" + address);
		System.out.println("Mobile number :: \t\t\t" + mob_no);
		System.out.println("Mail Id :: \t\t\t" + mail_id);
		System.out.println("========================================================================");

	}
	

	public void calc_salary() {
		// calculation of the salary
		DA = 0.97 * basic_pay;
		HRA = 0.1 * basic_pay;
		PF = 0.12 * basic_pay;
		SCF = 0.001 * basic_pay;
		gross_salary = (basic_pay + DA + HRA);
		net_salary = (gross_salary - PF - SCF);
	}

	public void display_salary() {

		//dispalying salary
		System.out.println("Basic  pay :: \t\t\t" + basic_pay);
		System.out.println("DA :: \t\t\t\t" + DA);
		System.out.println("HRA :: \t\t\t\t" + HRA);
		System.out.println("PF :: \t\t\t\t" + PF);
		System.out.println("SCF :: \t\t\t\t" + SCF);
		System.out.println("=============================================================================");
		System.out.println("Gross salary :: \t\t" + gross_salary);
		System.out.println("Net salary :: \t\t\t" + net_salary);
		System.out.println("=============================================================================");
	}

}
//derived class 1
class Programmer extends Employee {

	public void P_input() {
		System.out.println("Enter all details of Programmer:");//for all details 
		read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay of Programmer:");//user input for basic pay
		basic_pay=sc.nextInt();
	}
}
//derived class 2
class Team_lead extends Employee{
	
	public void TL_input() {
		System.out.println("Enter all details of Team Lead:");//for all details 
		read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay of Team Lead:");//user input for basic pay
		basic_pay=sc.nextInt();
	}
}

//derived class 3
class Project_manager extends Employee {

	public void PM_input() {
		System.out.println("Enter all details of Project Mnanager:");//for all details 
		read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay of Project Mnanager:");//user input for basic pay
		basic_pay=sc.nextInt();
	}
}
//derived class 4
class Assistant_project_manager extends Employee {
	public void A_input() {
		System.out.println("Enter all details of assistant project manager:");//for all details 
		read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay of assistant project manager:");//user input for basic pay
		basic_pay=sc.nextInt();
	}
}public class Employee_main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
		System.out.println("\nEnter the designation of employee you want to generate salary slip");
		System.out.println("1.PROGRAMMER");
		System.out.println("2.TEAM LEADER");
		System.out.println("3.ASSISTANT PROJECT MANAGER");
		System.out.println("4.PROJECT MANAGER");
		System.out.println("5.EXIT PROGRAM");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you choice:");
		int opn=sc.nextInt();
		
		
		switch(opn) {
			
			case 1:
				
				System.out.println("Enter the number of programmers:");
				Scanner s1=new Scanner(System.in);
				int n1=s1.nextInt();
				Programmer P[]=new Programmer[n1];
		
				for(int i=0;i<n1;i++) {
					System.out.println("Enter All the required data for PROGRAMMER "+(i+1));
					P[i]=new Programmer();
					P[i].P_input();
					P[i].display();
					P[i].calc_salary();
					P[i].display_salary();
				}
				break;
				
			case 2:
				System.out.println("Enter the number of team leaders:");
				Scanner s2=new Scanner(System.in);
				int n2=s2.nextInt();
				Team_lead T[]=new Team_lead[n2];
				
				for(int i=0;i<n2;i++) {
					System.out.println("\nEnter All the required data for TEAM LEADER "+(i+1));
					T[i]=new Team_lead();
					T[i].TL_input();
					T[i].display();
					T[i].calc_salary();
					T[i].display_salary();
				}
				break;
				
			case 3:
				
				System.out.println("Enter the number of Assistant project managers:");
				Scanner s3=new Scanner(System.in);
				int n3=s3.nextInt();
				
				Assistant_project_manager AM[]=new Assistant_project_manager[n3];
				for(int i=0;i<n3;i++) {
					System.out.println("\nEnter All the required data for ASSISTANT PROJECT MANAGER "+(i+1));
					AM[i]=new Assistant_project_manager();
					AM[i].A_input();
					AM[i].display();
					AM[i].calc_salary();
					AM[i].display_salary();
				}
				break;
			
			case 4:
				
				System.out.println("Enter the number of project managers:");
				Scanner s4=new Scanner(System.in);
				int n4=s4.nextInt();
				
				Project_manager M[]=new Project_manager[n4];
				for(int i=0;i<n4;i++) {
					System.out.println("\nEnter All the required data for PROJECT MANAGER "+(i+1));
					M[i]=new Project_manager();
					M[i].PM_input();
					M[i].display();
					M[i].calc_salary();
					M[i].display_salary();
				}
				break;
				
			case 5:
				System.out.println("Sure want to exit? \n1.YES\n2.NO");
				int k=sc.nextInt();
				
				if(k==1) {
					System.out.println("Program finished!!");
					return;
				}
				else {
					break;
				}
			default:
				System.out.println("Enter a vaild choice!!");
				break;
			}
	}
	}

}
