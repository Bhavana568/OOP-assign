//==============================================================================
//NAME : BHAVANA BAFNA
//BATCH: E9
//ROLL NO.: 23107
//SUBJECT:OOP ASSIGNMENT 1
//TOPIC:COMPLEX NUMBER
//==============================================================================

package complex0;

import java.util.*;
class complex0
{
	private double real;
	private double img;
//DEFAULT CONSTRUCTOR
	complex0()
	{
		real=img=0;
	}
//PARAMETRIZED CONSTRUCTOR
	complex0(double r,double i)
	{
		real = r;
		img = i;
	}
//DISPLAY
	public void display()
	{
		System.out.println(real+"+"+img+"i");
	}
//ADDITON
	public complex0 add(complex0 a) 
	{
		complex0 t = new complex0();
	    t.real=a.real+real;
	    t.img=a.img+img;
//return t to main function
		return t; 
	}

//SUBTRACTION
	public complex0 sub(complex0 a)
	{
		  complex0 t=new complex0();
		  t.real=a.real-real;
		  t.img=a.img-img;
//return t to main function
		  return t;

	}
//MULTIPLICATION
	public complex0 mul(complex0 a)
	{
		  complex0 t=new complex0();
		  t.real =(a.real*real)-(a.img*img);
		  t.img = (a.real*img)+(a.img*real);
//return t to main function
		  return t;

	}
//DIVISION
	public complex0 divi(complex0 a)
	{
		complex0 t=new complex0();
		t.real=(a.real*real+a.img*img)/(real*real+img*img);
		t.img=(real*a.img-a.real*img)/(real*real+img*img);
//return t to main function
		return t;

	}
	


	
	
//MAIN FUNCTION
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number with real and imaginary part");
		complex0 obj1=new complex0(s.nextDouble(),s.nextDouble());
		System.out.println("Enter 2nd number with real and imaginary part");
		complex0 obj2=new complex0(s.nextDouble(),s.nextDouble());
		
		complex0 ans=new complex0();
		int op;
		
		do {
			System.out.println("___MENU___\n1. Addition\n2. Subtraction\n3. multiplication\n4. division\n5. Exit");
			op=s.nextInt();
			switch(op)
			{
		case 1: obj1.add(obj2);
		ans.display();
		break; 
		case 2:obj1.sub(obj2);
		ans.display();
		break;    
		case 3:obj1.mul(obj2);
		ans.display();
		break;    
		case 4:obj1.divi(obj2);
		ans.display();
		break;  
		case 5:System.out.println("Program finished");
		break; 
			
		default:System.out.println("Invalid Entry!!");
		break;
			}
			
		}while(op!=5);
} 
}

//============================================================================================
//OUTPUT:
//Enter 1st number with real and imaginary part
//1
//2
//Enter 2nd number with real and imaginary part
//3
//4
//___MENU___
//1. Addition
//2. Subtraction
//3. multiplication
//4. division
//5. Exit
//
//1
//0.0+0.0i
//___MENU___
//1. Addition
//2. Subtraction
//3. multiplication
//4. division
//5. Exit
//2
//0.0+0.0i
//___MENU___
//1. Addition
//2. Subtraction
//3. multiplication
//4. division
//5. Exit
//3
//0.0+0.0i
//___MENU___
//1. Addition
//2. Subtraction
//3. multiplication
//4. division
//5. Exit
//4
//0.0+0.0i
//___MENU___
//1. Addition
//2. Subtraction
//3. multiplication
//4. division
//5. Exit
//5
//Program finished
//==========================================================================================
