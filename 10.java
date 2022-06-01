//====================================================================================
//NAME            : BHAVANA BAFNA
//CLASS           : SE 09
//BATCH           : E 09
//ROLL NO.        : 23107
//ASSIGNMENT NO.  : 10
//ASSIGNMENT NAME : FACTORY DESIGN PATTERN
//====================================================================================

package car;
import java.util.Scanner;
class Cars
{   
    String Colour;
    boolean engineassembled;
    boolean wheelsassembled;
    boolean chassisready;
    double price;
    int ask()
    {      
        int type;
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the type of car to be manufactured: ");
        System.out.println("1. SUV");
        System.out.println("2. Hatchback");
        System.out.println("3. Sedan");
        type = sd.nextInt();
        return (type>0 && type<4)? type : ask();
    }
}
    class SUV extends Cars
    {   
        SUV()
        {
            Colour = "white";
            engineassembled = false;
            wheelsassembled = false;
            chassisready = false;
            price = 0;
        }
    }
    class Hatchback extends Cars
    {
        Hatchback()
        {
            Colour = "Black";
            engineassembled = false;
            wheelsassembled = false;
            chassisready = false;
            price = 0;
        }
    }
    class Sedan extends Cars
    {   
        Sedan()
        {
            Colour = "Red";
            engineassembled = false;
            wheelsassembled = false;
            chassisready = false;
            price = 0;
        }
    }
interface Testfactory
{
    void engine();
    void wheels();
    void chassis();
    String paint();
    double pricet(int x);
}
class Carfactory implements Testfactory
{   
    public void engine()
    {
        System.out.println("Engine is Assembled");
    }
    public void chassis()
    {
        System.out.println("Chassis is Ready");
    }
    public void wheels()
    {
        System.out.println("Wheels are Assembled");
    }
    public String paint()
    {   
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the desired Colour: ");
        return(sd.nextLine());
    }
    public double pricet(int x)
    {
        if(x ==1)
        {   
            System.out.println("Price of our SUV Model is: "+ 50000);
            return 50000;
        }
        else if (x ==2)
        {   
            System.out.println("Price of our Harchback Model is: "+ 20000);
            return 20000;
        }
        else 
        {
            System.out.println("Price of our Sedan Model is: "+ 10000);
            return 10000;
        }
    }

}

public class assigment_10
{
    public static void main(String[] args)
    {
        Cars c1 = new Cars();
        Carfactory f1 = new Carfactory();
        int o = c1.ask();
        if(o==1)
        {
            System.out.println("SUV is being Created in the factory");
            SUV s1 = new SUV();
            f1.chassis();
            s1.chassisready = true;
            f1.engine();
            s1.engineassembled = true;
            f1.wheels();
            s1.wheelsassembled = true;
            s1.Colour = f1.paint();
            s1.price = f1.pricet(o);
            if(s1.chassisready&&s1.engineassembled&&s1.wheelsassembled)
            {
                System.out.println("Your "+ s1.Colour+" SUV costs "+ s1.price);
            }
        }
        else if(o==2)
        {
            System.out.println("Hatchback is being Created in the factory");
            Hatchback s1 = new Hatchback();
            f1.chassis();
            s1.chassisready = true;
            f1.engine();
            s1.engineassembled = true;
            f1.wheels();
            s1.wheelsassembled = true;
            s1.Colour = f1.paint();
            s1.price = f1.pricet(o);
            if(s1.chassisready&&s1.engineassembled&&s1.wheelsassembled)
            {
                System.out.println("Your "+ s1.Colour+" Hatchback costs "+ s1.price);
            }
        }
        else
        {
            System.out.println("Sedan is being Created in the factory");
            Sedan s1 = new Sedan();
            f1.chassis();
            s1.chassisready = true;
            f1.engine();
            s1.engineassembled = true;
            f1.wheels();
            s1.wheelsassembled = true;
            s1.Colour = f1.paint();
            s1.price = f1.pricet(o);
            if(s1.chassisready&&s1.engineassembled&&s1.wheelsassembled)
            {
                System.out.println("Your "+ s1.Colour+" Sedan costs "+ s1.price);
            }
        }

    }
}

//======================OUTPUT======================
//Enter the type of car to be manufactured: 
//1. SUV
//2. Hatchback
//3. Sedan
//1
//SUV is being Created in the factory
//Chassis is Ready
//Engine is Assembled
//Wheels are Assembled
//Enter the desired Colour: 
//Red
//Price of our SUV Model is: 50000
//Your Red SUV costs 50000.0
//==================================================