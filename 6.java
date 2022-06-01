//=================================================================================================================//
//AUTHOR: BHAVANA BAFNA
//ROLL NO.: 23107
//BATCH:E9
//SUBJECT: OOP LAB
//TOPIC : ASSIGNMENT 6
//DESCRIPTION: EXCEPTION HANDLING
//Version : 1
//=================================================================================================================//

package oop_6;
import java.util.*;
//class defined
class IntException{
	int num,deno,ans;
//method to check error in division
	void error() {
		Scanner sc=new Scanner(System.in);
		//try and catch block
		try {
		System.out.println("Enter numerator");
		num=sc.nextInt();
		System.out.println("Enter denominator");
		deno=sc.nextInt();
		}// if invalid division
		catch(NumberFormatException numerror){
			System.out.println("Exception error is: :"+numerror);//error thrown
		}
		//try and catch block
		try {
			ans=num/deno;//division 
			System.out.println("Division of numbers is:"+ans);
		}//if division possible
		catch(ArithmeticException artherror){
			System.out.println("Exception error is:  "+ artherror);
		}
		//final methods
		finally {
			System.out.println("Out of try and catch!!");
		}
	}
}
//method finish
class ArrayException{
	//method for array checking
	void error(int arr[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Index you want to find:");
		int n=s.nextInt();
		//try and catch block
		try {
			
			System.out.println(arr[n]);
			System.out.println("The required element at index "+ n +" is");//if element found
		}
		catch(ArrayIndexOutOfBoundsException bounderror){
			System.out.println("Exception error is:"+ bounderror);
		}//error thrown
		finally {//final method 
			System.out.println("Out of try and catch!!");
		}
	}
	
}
//main class
public class Exception {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Case 1:Division");//for division
		IntException Int =new IntException();
		Int.error();
		
		System.out.println("\nCase 2: Array");//for array
		int arr[]= {1,2,3,4,5,6,7,8,9};
		ArrayException Arr=new ArrayException();
		Arr.error(arr);
		
	}
}
//program finished!!

//============================OUTPUT==================================================

//Case 1:Division
//Enter numerator
//0
//Enter denominator
//0
//Exception error is:  java.lang.ArithmeticException: / by zero
//Out of try and catch!!
//
//Case 2: Array
//Enter Index you want to find:
//23
//Exception error is:java.lang.ArrayIndexOutOfBoundsException: 23
//Out of try and catch!!

//-------------------------------------------------------------------------------------