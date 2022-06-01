//====================================================================================
//NAME            : BHAVANA BAFNA
//CLASS           : SE 09
//BATCH           : E 09
//ROLL NO.        : 23107
//ASSIGNMENT NO.  : 11
//ASSIGNMENT NAME : STRATEGY DESIGN PATTERN
//====================================================================================

package payment;
import java.util.Scanner;
import java.util.Scanner;
class coffeeCustomer
{
    protected double total;
    int paymethod;
    public void settotal(double total)
    {
        this.total=total;
    }
    public double gettotal()
    {
        return total;
    }
}
class Items
{   
    int coffee_no;
    int qty;
    coffeeCustomer c1 = new coffeeCustomer();
    public void shop()
    {   
        Scanner sd = new Scanner(System.in);
        System.out.println("                      Our Stock:                    ");
        System.out.println("******************");
        System.out.println("1. AFFOGATO\t\t\tMRP: 500");
        System.out.println("2. AMERICANO\t\t\tMRP: 700");
        System.out.println("3. CAFFÈ LATTE\t\t\tMRP: 500");
        System.out.println("4. CAPPUCCINO\t\t\tMRP: 800");
        System.out.println("5. DOUBLE ESPRESSO\t\tMRP: 700");
        coffee_no = sd.nextInt();
        System.out.println("Enter Qty: ");
        qty = sd.nextInt();
        switch(coffee_no)
        {
	        case 1:        
	        {
	            coffee1(qty);
	            System.out.println("Do you wish to shop more? Press Y to continue and N to Pay Bill");
	            if(sd.nextLine().equalsIgnoreCase("Y"))
	            {
	                shop();
	            }
	            else 
	            {   
	                askpay();
	            }
	            break;
	        }
	        case 2:
	        {
	        	coffee2(qty);
	            System.out.println("Do you wish to shop more? Press Y to continue and N to Pay Bill");
	            if(sd.nextLine().equalsIgnoreCase("Y"))
	            {
	                shop();
	            }
	            else 
	            {   
	                askpay();
	            }
	            break;
	        }
	        case 3:        
	        {
	        	coffee3(qty);
	            System.out.println("Do you wish to shop more? Press Y to continue and N to Pay Bill");
	            if(sd.nextLine().equalsIgnoreCase("Y"))
	            {
	                shop();
	            }
	            else 
	            {   
	                askpay();
	            }
	            break;
	        }
	        case 4:
	        {
	        	coffee4(qty);
	            System.out.println("Do you wish to shop more? Press Y to continue and N to Pay Bill");
	            if(sd.nextLine().equalsIgnoreCase("Y"))
	            {
	                shop();
	            }
	            else 
	            {   
	                askpay();
	            }
	        }
	        case 5:        
	        {
	        	coffee5(qty);
	            System.out.println("Do you wish to shop more? Press Y to continue and N to Pay Bill");
	            if(sd.nextLine().equalsIgnoreCase("Y"))
	            {
	                shop();
	            }
	            else 
	            {   
	                askpay();
	            }
	            break;
	        }
	        default:
	        {
	            System.out.println("The item you requested is not in stock");
	            shop();
	            break;
	        }
        }
    }
    int askpay()
    {   
        Scanner sd = new Scanner(System.in);
        System.out.println("*****************");
        System.out.println("Your Total is: "+ c1.gettotal());
        System.out.println("How do you wish top pay? ");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. Cash");
        int p = sd.nextInt();
        c1.paymethod = (p>0 &&p<4)? p: askpay();
        Paymentpattern r1 = new Paymentpattern();
        r1.paymentdone(c1);
        return p;
    } 
    void coffee1(int q)
    {
    	double price = 500;
        c1.settotal(c1.gettotal()+price*q);
        //System.out.println("Total: "+c1.gettotal());
    }
    void coffee2(int q)
    {
    	double price0 = 700;
        c1.settotal(c1.gettotal()+price0*q);
    }
    void coffee3(int q)
    {
    	double price1 = 500;
        c1.settotal(c1.gettotal()+price1*q);
    }   
    void coffee4(int q)
    {
    	double price2 = 800;
        c1.settotal(c1.gettotal()+price2*q);
    }
    void coffee5(int q)
    {
        double price3 = 700;
        c1.settotal(c1.gettotal()+price3*q);
    }

	interface Paymentmethod
	{
	    void paymentdone(coffeeCustomer x);
	}
	class Paymentpattern implements Paymentmethod
	{
	    public void paymentdone(coffeeCustomer x)
	    {
	        if(x.paymethod ==1)
	        {
	            System.out.println("Total Price "+ x.gettotal()+ " paid by Credit Card");
	        }
	        else if(x.paymethod ==2)
	        {
	            System.out.println("Total Price "+ x.gettotal()+ " paid by Debit Card");
	        }
	        else
	        {
	            System.out.println("Total Price "+ x.gettotal()+ " paid by Cash");
	        }
	    }
	}
}
public class Assignment11 
{   
    public static void main(String[] args)
    {
        Items Store1 = new Items();
        Store1.shop();
    }
}

//-----------------------------OUTPUT-----------------------------
//Our Stock:                    
//******************
//1. AFFOGATO			MRP: 500
//2. AMERICANO			MRP: 700
//3. CAFFÈ LATTE			MRP: 500
//4. CAPPUCCINO			MRP: 800
//5. DOUBLE ESPRESSO		MRP: 700
//1
//Enter Qty: 
//2
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//*****************
//Your Total is: 1000.0
//How do you wish top pay? 
//1. Credit Card
//2. Debit Card
//3. Cash
//1
//Total Price 1000.0 paid by Credit Card
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//y
//Our Stock:                    
//******************
//1. AFFOGATO			MRP: 500
//2. AMERICANO			MRP: 700
//3. CAFFÈ LATTE			MRP: 500
//4. CAPPUCCINO			MRP: 800
//5. DOUBLE ESPRESSO		MRP: 700
//2
//Enter Qty: 
//1
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//*****************
//Your Total is: 1700.0
//How do you wish top pay? 
//1. Credit Card
//2. Debit Card
//3. Cash
//1
//Total Price 1700.0 paid by Credit Card
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//y
//Our Stock:                    
//******************
//1. AFFOGATO			MRP: 500
//2. AMERICANO			MRP: 700
//3. CAFFÈ LATTE			MRP: 500
//4. CAPPUCCINO			MRP: 800
//5. DOUBLE ESPRESSO		MRP: 700
//3
//Enter Qty: 
//3
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//*****************
//Your Total is: 3200.0
//How do you wish top pay? 
//1. Credit Card
//2. Debit Card
//3. Cash
//1
//Total Price 3200.0 paid by Credit Card
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//y
//Our Stock:                    
//******************
//1. AFFOGATO			MRP: 500
//2. AMERICANO			MRP: 700
//3. CAFFÈ LATTE			MRP: 500
//4. CAPPUCCINO			MRP: 800
//5. DOUBLE ESPRESSO		MRP: 700
//4
//Enter Qty: 
//5
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//*****************
//Your Total is: 7200.0
//How do you wish top pay? 
//1. Credit Card
//2. Debit Card
//3. Cash
//1
//Total Price 7200.0 paid by Credit Card
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//y
//Our Stock:                    
//******************
//1. AFFOGATO			MRP: 500
//2. AMERICANO			MRP: 700
//3. CAFFÈ LATTE			MRP: 500
//4. CAPPUCCINO			MRP: 800
//5. DOUBLE ESPRESSO		MRP: 700
//1
//Enter Qty: 
//2
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//*****************
//Your Total is: 8600.0
//How do you wish top pay? 
//1. Credit Card
//2. Debit Card
//3. Cash
//1
//Total Price 8600.0 paid by Credit Card
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//Y
//Our Stock:                    
//******************
//1. AFFOGATO			MRP: 500
//2. AMERICANO			MRP: 700
//3. CAFFÈ LATTE			MRP: 500
//4. CAPPUCCINO			MRP: 800
//5. DOUBLE ESPRESSO		MRP: 700
//7
//Enter Qty: 
//2
//The item you requested is not in stock
//Do you wish to shop more? Press Y to continue and N to Pay Bill
//N