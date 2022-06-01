//====================================================================================
//NAME            : BHAVANA BAFNA
//CLASS           : SE 09
//BATCH           : E 09
//ROLL NO.        : 23107
//ASSIGNMENT NO.  : 8
//ASSIGNMENT NAME : FILE HANDLING
//====================================================================================

package assign8;
import java.util.*;
import java.io.*;

//class Student with methods used to manipulate database
class Student
{
	private String name,stu_class,address;  //to store name,class and address of student
	private static int rollno = 23100,id = 2700;  //static members to autogenerate id and roll no
	private static String student_id = "I2K1910"; //static string member for id
	private int marks;  //to store marks of student
	
	//default constructor
	Student()
	{
		name = "";
		stu_class = "";
		address = "";
		marks = 0;
	}
	
	//method which takes input from user and writes it to file
	public void input(FileWriter fw) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\nENTER NAME:");
		name = scan.next();   //takes name as input
		System.out.println("ENTER CLASS:");
		stu_class = scan.next();  //takes class as input
		System.out.println("ENTER MARKS OUT OF 100");
		marks = scan.nextInt();   //takes marks as input
		System.out.println("ENTER ADDRESS:");
		address = scan.next();    //takes address as input
		//writing the inputs takes to file with ',' as delimiter
		fw.write((student_id + (id++)) + "," + name + "," + (rollno++) + "," + stu_class + "," + marks + "," + address );
		fw.write("\n");
	}
	
	public void display(FileReader fr) throws IOException
	{
		BufferedReader br = new BufferedReader(fr);
		String line;
		String arr[];
		while((line=br.readLine())!=null)
		{
			arr = line.split(",");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i] + "\t\t");
			}
			System.out.print("\n");
		}
		br.close();
	}
	
	public void search(BufferedReader br) throws IOException
	{
		String str,line;
		String arr[]=null;
		int flag=0;
		System.out.println("\nENTER THE STUDENT ID TO BE SEARCHED:");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		while((line=br.readLine())!=null)
		{
			arr=line.split(",");
			if(arr[0].equals(str))
			{
				flag = 1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("SEARCH FOUND!!");
			System.out.println("\n\t\t\t**STUDENT DATABASE**");
			System.out.println("ID\t\t"+"NAME\t\t"+"ROLLNO\t\t"+"CLASS\t\t"+"MARKS\t\t"+"ADDRESS");
			System.out.println("------------------------------------------------------------------------------------\n");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i] + "\t\t");
			}
			System.out.println("\n------------------------------------------------------------------------------------\n");
		}
		else
		{
			System.out.println("NOT FOUND!!");
		}
	}
	
	public void deleteRecord(BufferedReader br,FileWriter fw) throws IOException
	{
		String str,line;
		String arr[];
		int flag = 0;
		System.out.println("\nENTER THE ID OF RECORD TO BE DELETED");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		while((line=br.readLine())!=null)
		{
			arr=line.split(",");
			if(arr[0].equalsIgnoreCase(str))
			{
				flag = 1;
				System.out.println("RECORD DELETED!!");
				System.out.println("ID\t\t"+"NAME\t\t"+"ROLLNO\t\t"+"CLASS\t\t"+"MARKS\t\t"+"ADDRESS");
				System.out.println("------------------------------------------------------------------------------------\n");
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i] + "\t\t");
				}
				System.out.println("\n------------------------------------------------------------------------------------\n");
			}
			else
			{
				fw.write(line + "\n");
			}
		}
		if(flag!=1)
		{
			System.out.println("NO RECORD FOUND!!");
		}
	}
	
	public void modifyRecord(BufferedReader br,FileWriter fw) throws IOException
	{
		String str,line;
		String arr[];
		int flag = 0;
		System.out.println("\nENTER THE ID OF RECORD TO BE MODIFIED");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		while((line=br.readLine())!=null)
		{
			arr=line.split(",");
			if(arr[0].equalsIgnoreCase(str))
			{
				System.out.println("\nENTER NAME:");
				name = scan.next();   //takes name as input
				System.out.println("ENTER CLASS:");
				stu_class = scan.next();  //takes class as input
				System.out.println("ENTER MARKS OUT OF 100");
				marks = scan.nextInt();   //takes marks as input
				System.out.println("ENTER ADDRESS:");
				address = scan.next();    //takes address as input
				fw.write(arr[0]+ "," + name + "," + arr[2] + "," + stu_class + "," + marks + "," + address + "\n");
				flag = 1;
			}
			else
			{
				fw.write(line + "\n");
			}
		}
		if(flag!=1)
		{
			System.out.println("NO RECORD FOUND!!");
		}
	}
}

public class FileHandling
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		FileWriter stuDB = new FileWriter("StudentDatabase.txt");
		System.out.println("ENTER TOTAL NO OF STUDENTS:");
		int total = sc.nextInt();
		Student stud = new Student();
		for(int i=0;i<total;i++)
		{
			stud.input(stuDB);
		}
		stuDB.close();
		boolean rep = true;
		int opt;
		while(rep)
		{
			System.out.println("\n---------------------------------------------");
			System.out.println("          MENU           ");
			System.out.println("---------------------------------------------");
			System.out.println("1.Display database");
			System.out.println("2.Search record");
			System.out.println("3.Clear record");
			System.out.println("4.Modify record");
			System.out.println("5.Add record");
			System.out.println("PRESS 0,TO EXIT");
			System.out.println("---------------------------------------------");
			opt = sc.nextInt();
			switch(opt)
			{
			case 0:
				System.out.println("\n\tTHANK YOU!!");
				rep = false;
				break;
			case 1:
				FileReader stuDBScan = new FileReader("StudentDatabase.txt");
				System.out.println("\n\t\t\t**STUDENT DATABASE**");
				System.out.println("ID\t\t"+"NAME\t\t"+"ROLLNO\t\t"+"CLASS\t\t"+"MARKS\t\t"+"ADDRESS");
				System.out.println("------------------------------------------------------------------------------------");
				stud.display(stuDBScan);
				System.out.println("------------------------------------------------------------------------------------");
				stuDBScan.close();
				break;
			case 2:
				BufferedReader br1 = new BufferedReader(new FileReader("StudentDatabase.txt"));
				stud.search(br1);
				br1.close();
				break;
			case 3:
				BufferedReader br2 = new BufferedReader(new FileReader("StudentDatabase.txt"));
				FileWriter fw = new FileWriter("StudentDatabase1.txt");
				stud.deleteRecord(br2,fw);
				br2.close();
				fw.close();
				File fl = new File("StudentDatabase.txt");
				File flnew = new File("StudentDatabase1.txt");
				fl.delete();
				flnew.renameTo(fl);
				break;
			case 4:
				BufferedReader br3 = new BufferedReader(new FileReader("StudentDatabase.txt"));
				FileWriter fw1 = new FileWriter("StudentDatabase1.txt");
				stud.modifyRecord(br3, fw1);
				br3.close();
				fw1.close();
				File fl1 = new File("StudentDatabase.txt");
				File flnew1 = new File("StudentDatabase1.txt");
				fl1.delete();
				flnew1.renameTo(fl1);
				break;
			case 5:
				FileWriter stuDB1 = new FileWriter("StudentDatabase.txt",true);
				System.out.println("ENTER TOTAL NO OF STUDENTS TO BE ADDED:");
				total = sc.nextInt();
				for(int i=0;i<total;i++)
				{
					stud.input(stuDB1);
				}
				stuDB1.close();
			default:
				System.out.println("\n\tENTER VALID CHOICE");
			}
		}
		System.exit(0);
	}
}
//--------------------------------------OUTPUT------------------------------------------------
//ENTER TOTAL NO OF STUDENTS:
//5
//
//ENTER NAME:
//Bhavana
//ENTER CLASS:
//9
//ENTER MARKS OUT OF 100
//89
//ENTER ADDRESS:
//Nashik
//
//ENTER NAME:
//Aditya
//ENTER CLASS:
//4
//ENTER MARKS OUT OF 100
//67
//ENTER ADDRESS:
//Pune
//
//ENTER NAME:
//Saakshi
//ENTER CLASS:
//3
//ENTER MARKS OUT OF 100
//88
//ENTER ADDRESS:
//Mumbai
//
//ENTER NAME:
//Alok
//ENTER CLASS:
//1
//ENTER MARKS OUT OF 100
//90
//ENTER ADDRESS:
//Aurangabad
//
//ENTER NAME:
//Siddhi
//ENTER CLASS:
//8
//ENTER MARKS OUT OF 100
//78
//ENTER ADDRESS:
//Jalgaon
//
//---------------------------------------------
//          MENU           
//---------------------------------------------
//1.Display database
//2.Search record
//3.Clear record
//4.Modify record
//5.Add record
//PRESS 0,TO EXIT
//---------------------------------------------
//1
//
//			**STUDENT DATABASE**
//ID		NAME		ROLLNO		CLASS		MARKS		ADDRESS
//------------------------------------------------------------------------------------
//I2K19102700		Bhavana		23100		9		89		Nashik		
//I2K19102701		Aditya		23101		4		67		Pune		
//I2K19102702		Saakshi		23102		3		88		Mumbai		
//I2K19102703		Alok		23103		1		90		Aurangabad		
//I2K19102704		Siddhi		23104		8		78		Jalgaon		
//------------------------------------------------------------------------------------
//
//---------------------------------------------
//          MENU           
//---------------------------------------------
//1.Display database
//2.Search record
//3.Clear record
//4.Modify record
//5.Add record
//PRESS 0,TO EXIT
//---------------------------------------------
//2
//
//ENTER THE STUDENT ID TO BE SEARCHED:
//I2K19102704
//SEARCH FOUND!!
//
//			**STUDENT DATABASE**
//ID		NAME		ROLLNO		CLASS		MARKS		ADDRESS
//------------------------------------------------------------------------------------
//
//I2K19102704		Siddhi		23104		8		78		Jalgaon		
//------------------------------------------------------------------------------------
//
//
//---------------------------------------------
//          MENU           
//---------------------------------------------
//1.Display database
//2.Search record
//3.Clear record
//4.Modify record
//5.Add record
//PRESS 0,TO EXIT
//---------------------------------------------
//2
//
//ENTER THE STUDENT ID TO BE SEARCHED:
//
//I2K19102705
//NOT FOUND!!
//
//---------------------------------------------
//          MENU           
//---------------------------------------------
//1.Display database
//2.Search record
//3.Clear record
//4.Modify record
//5.Add record
//PRESS 0,TO EXIT
//---------------------------------------------
//3
//
//ENTER THE ID OF RECORD TO BE DELETED
//
//I2K19102704
//RECORD DELETED!!
//ID		NAME		ROLLNO		CLASS		MARKS		ADDRESS
//------------------------------------------------------------------------------------
//
//I2K19102704		Siddhi		23104		8		78		Jalgaon		
//------------------------------------------------------------------------------------
//
//
//---------------------------------------------
//          MENU           
//---------------------------------------------
//1.Display database
//2.Search record
//3.Clear record
//4.Modify record
//5.Add record
//PRESS 0,TO EXIT
//---------------------------------------------
//4
//
//ENTER THE ID OF RECORD TO BE MODIFIED
//
//I2K19102703
//
//ENTER NAME:
//Dishitaa
//ENTER CLASS:
//10
//ENTER MARKS OUT OF 100
//85
//ENTER ADDRESS:
//Nashik
//
//---------------------------------------------
//          MENU           
//---------------------------------------------
//1.Display database
//2.Search record
//3.Clear record
//4.Modify record
//5.Add record
//PRESS 0,TO EXIT
//---------------------------------------------
//1
//
//			**STUDENT DATABASE**
//ID		NAME		ROLLNO		CLASS		MARKS		ADDRESS
//------------------------------------------------------------------------------------
//I2K19102700		Bhavana		23100		9		89		Nashik		
//I2K19102701		Aditya		23101		4		67		Pune		
//I2K19102702		Saakshi		23102		3		88		Mumbai		
//I2K19102703		Dishitaa		23103		10		85		Nashik		
//------------------------------------------------------------------------------------
//
//---------------------------------------------
//          MENU           
//---------------------------------------------
//1.Display database
//2.Search record
//3.Clear record
//4.Modify record
//5.Add record
//PRESS 0,TO EXIT
//---------------------------------------------
//5
//ENTER TOTAL NO OF STUDENTS TO BE ADDED:
//1
//
//ENTER NAME:
//Falguni
//ENTER CLASS:
//2
//ENTER MARKS OUT OF 100
//76
//ENTER ADDRESS:
//J&k
//
//---------------------------------------------
//          MENU           
//---------------------------------------------
//1.Display database
//2.Search record
//3.Clear record
//4.Modify record
//5.Add record
//PRESS 0,TO EXIT
//---------------------------------------------
//0
//
//	THANK YOU!!

