//=================================================================================================================//
//AUTHOR: BHAVANA BAFNA
//ROLL NO.: 23107
//BATCH:E9
//SUBJECT: OOP LAB
//TOPIC : ASSIGNMENT 3
//DESCRIPTION: EMPLOYEE
//=================================================================================================================//
package oop_4;
import java.util.*;
import java.util.Scanner;
//parent class shape
class Shape{
	int side_a,side_b;//variables for sides input
	double area;//declaring variable to claculate and store area
	//constructor for class shape
	Shape()
	{
		//initializing variables of side
		side_a=1;
		side_b=1;
	}
	//method to take input of sides from user
	public void input() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter side A : ");//input for side A
		side_a=sc.nextInt(); 
		System.out.println("Enter side B : ");//input for side B
		side_b=sc.nextInt(); 
	}
	//method to calculate area
	double compute_area(){
		System.out.println("I'm function to compute area of desired Shape");
		System.out.println("You can calculate area in derived class.");
		return 1.0;
	}
}
//derived class 1 triangle
class triangle extends Shape{
	//method to compute area
	double compute_area(){
		System.out.println("I'm function to compute area of TRIANGLE");
		input();//for input of sides
		area= 0.5*side_a*side_b;//calculate area of triangle
		System.out.println("Area of triangle is = "+area);//print area
		return 0.5*side_a*side_b;//return area
	} 
}
//derived class 2 rectangle
class rectangle extends Shape{
	//method to compute area
	double compute_area(){
		System.out.println("I'm function to compute area of RECTANGLE");
		input();//for input of sides
		area= 1*side_a*side_b;//calculate area of rectangle
		System.out.println("Area of triangle is = "+area);//print area
		return 1/2*side_a*side_b;//return area
	}
}
//main program
public class Shape_main {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);//new scanner
		Shape shape;
		//calling and declaring variables and methods
		shape=new Shape();//new shape 
		shape.compute_area();//call method
		shape=new triangle();//new triangle
		shape.compute_area();//call method
		shape=new rectangle();//new rectangle
		shape.compute_area();//call method
		
	}
//Program finished!!
}
