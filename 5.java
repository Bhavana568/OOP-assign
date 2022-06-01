//=================================================================================================================//
//AUTHOR: BHAVANA BAFNA
//ROLL NO.: 23107
//BATCH:E9
//SUBJECT: OOP LAB
//TOPIC : ASSIGNMENT 5
//DESCRIPTION: VEHICLE
//Version : 2
//=================================================================================================================//
package oop_5;
import java.util.*;
import java.util.Scanner;

interface Vehicle {   // Interface vehicle
	
	// Methods in the interface declared
	void gear_change(int g);
	void speed_up(int speed);
	void apply_brakes(int speed);
	void display();

}
class Car implements Vehicle { // Class car implements the vehicle interface
	int gear, speed; // data members of the class

	Car() { // default constructor
		gear = 1;
		speed = 10;

	}

	// Gear change method
	public void gear_change(int g) {
		if (g > 7) { // cannot exceed the gear limit of 7
			System.out.println("Cannot exceed the maximum limit.");

		} else {
			gear = g;

		}
	}

	// Method to speed up
	public void speed_up(int speed) {
		if (speed > 400) { // speed cannot exceed 400
			System.out.println("Speed maximum limit achieved");

		} else {

			this.speed += speed; // incrementing speed
			System.out.println("Speed: " + this.speed);

		}
	}

// Apply brakes method to  reduce speed or stop te vehicle
	public void apply_brakes(int speed) {
		if (speed == 0) { // if speed =0
			System.out.println("Car stopped");
		} else {
			this.speed -= speed; // decrement of the speed
			System.out.println("Speed :" + this.speed);
		}

	}

// Display method to display the current state of the vehicle
	public void display() {
		System.out.println("-----------------------FINAL STATE OF THE VEHICLE-------------------------");
		System.out.println("Speed      :: " + speed + " units");
		System.out.println("Gear No.   :: " + gear);
		System.out.println("--------------------------------------------------------------------------");
	}

}
class Bike implements Vehicle { // Bike class implements the Vehicle interface
	int gear, speed; // data members of bike class

	Bike() { // default class
		gear = 1;
		speed = 10;

	}

// Gear change method
	public void gear_change(int g) {

		if (g > 6) { // cannot exceed the gear limit of 6
			System.out.println("Cannot exceed the maximum limit.");

		} else {
			gear = g;

		}

	}

// Speed up method
	public void speed_up(int speed) {
		if (speed > 200) { // cannot exceed the speed limit of 200
			System.out.println("Speed maximum limit achieved");

		} else {

			this.speed += speed;
			System.out.println("Speed: " + this.speed);

		}

	}

// Apply brakes method 
	public void apply_brakes(int speed) {
		if (speed == 0) {
			System.out.println("Bike stopped");
		} else {
			this.speed -= speed;
			System.out.println("Speed :" + this.speed);
		}

	}

// Display method to display the current state of the vehicle
	public void display() {
		System.out.println("-----------------------FINAL STATE OF THE VEHICLE-------------------------");
		System.out.println("Speed      :: " + speed + " units");
		System.out.println("Gear No.   :: " + gear);
		System.out.println("--------------------------------------------------------------------------");
	}

}
class Bicycle implements Vehicle { // class Bicycle implements Vehicle interfce
	int gear, speed;

	Bicycle() { // default constructor
		gear = 1;
		speed = 10;

	}

// gear change method 
	public void gear_change(int g) {

		if (g > 14) { // cannot exceed gear limit of 14
			System.out.println("Cannot exceed the maximum limit.");

		} else {
			gear = g;

		}

	}

	// Speed up method 
		public void speed_up(int speed) {
			if (speed > 100) { // speed limit of 100 cannot be exceeded
				System.out.println("Speed maximum limit achieved");

			} else {

				this.speed += speed;
				System.out.println("Speed: " + this.speed);

			}

		}

	// Apply brakes method
		public void apply_brakes(int speed) {
			if (speed == 0) {
				System.out.println("Bicycle stopped");
			} else {
				this.speed -= speed;
				System.out.println("Speed :" + this.speed);
			}

		}

	// Display method
		public void display() {
			System.out.println("-----------------------FINAL STATE OF THE VEHICLE-------------------------");
			System.out.println("Speed      :: " + speed + " units");
			System.out.println("Gear No.   :: " + gear);
			System.out.println("--------------------------------------------------------------------------");
		}

	}
public class Vehicle_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Data  members:
		int gear;
		int speed;
		

		Scanner sc = new Scanner(System.in);
		// Menu driven program
		int choice;
		do {
			System.out.println("Choose the vehicle from the following");
			System.out.println("1. Bike");
			System.out.println("2. Car");
			System.out.println("3. Bicycle");
			System.out.println("4. Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Vehicle b = new Bike();   // reference of interface pointing to bike class
				
				int op1;
				do {
					System.out.println("Which operation would you like to perform?");
					System.out.println("1. Change gear");
					System.out.println("2. Change speed");
					System.out.println("3. Apply brakes");
					System.out.println("4. Display state of the vehicle");
					System.out.println("5. Exit");
					op1 = sc.nextInt();

					// Nested switch 
					switch (op1) {
					case 1:
						System.out.println("In which gear would you like to take your bike to?");
						gear = sc.nextInt();
						b.gear_change(gear);
						break;

					case 2:
						System.out.println("Speed up by?");   // increase speed by 
						speed = sc.nextInt(); 
						b.speed_up(speed);
						break;

					case 3:
						System.out.println("Speed down by?");   // decrease speed by
						speed=sc.nextInt();
						b.apply_brakes(speed);
						break;

					case 4:
						b.display();
						break;
					case 5:
						break;
					default:
						System.out.println("Invalid input");

					}

				} while (op1 != 5);

				break;
			case 2:
				Vehicle c = new Car();  // reference of Vehicle interface pointing to Car class
				
				int op2;
				do {
					System.out.println("Which operation would you like to perform?");
					System.out.println("1. Change gear");
					System.out.println("2. Change speed");
					System.out.println("3. Apply brakes");
					System.out.println("4. Display state of the vehicle");
					System.out.println("5. Exit");
					op2 = sc.nextInt();

					switch (op2) {
					case 1:
						System.out.println("In which gear would you like to take your car to?");
						gear = sc.nextInt();
						c.gear_change(gear);
						break;

					case 2:
						System.out.println("Speed up by?");
						speed = sc.nextInt();
						c.speed_up(speed);
						break;

					case 3:
						System.out.println("Speed down by?");
						speed = sc.nextInt();
						c.apply_brakes(speed);
						break;

					case 4:
						c.display();
						break;
					case 5:
						break;
					default:
						System.out.println("Invalid input");

					}

				} while (op2 != 5);
				break;
			case 3:
				Vehicle B = new Bicycle();  // Reference of Vehicle interface pointing to Bicycle class
				
				int op3;
				do {
					System.out.println("Which operation would you like to perform?");
					System.out.println("1. Change gear");
					System.out.println("2. Change speed");
					System.out.println("3. Apply brakes");
					System.out.println("4. Display the state of the vehicle");
					System.out.println("5. Exit");
					op3 = sc.nextInt();

					switch (op3) {
					case 1:
						System.out.println("In which gear would you like to take your car to?");
						gear = sc.nextInt();
						B.gear_change(gear);
						break;

					case 2:
						System.out.println("Speed up by?");
						speed = sc.nextInt();
						B.speed_up(speed);
						break;

					case 3:
						System.out.println("Speed down by?");
						speed = sc.nextInt();
						B.apply_brakes(speed);
						break;

					case 4:
						B.display();
						break;
					case 5:
						break;
					default:
						System.out.println("Invalid input");

					}

				} while (op3 != 5);

			}

		} while (choice != 4);

	}

}
//-----------------------------------	OUTPUT  -------------------------------------------
//------------------------------------------------------------------------------------------
//Choose the vehicle from the following
//1. Bike
//2. Car
//3. Bicycle
//4. Exit
//1
//Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		1
//		In which gear would you like to take your bike to?
//		3
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		2
//		Speed up by?
//		30
//		Speed: 40
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		3
//		Speed down by?
//		10
//		Speed :30
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		4
//		-----------------------FINAL STATE OF THE VEHICLE-------------------------
//		Speed      :: 30 units
//		Gear No.   :: 3
//		--------------------------------------------------------------------------
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		5
//		Choose the vehicle from the following
//		1. Bike
//		2. Car
//		3. Bicycle
//		4. Exit
//		2
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		1
//		In which gear would you like to take your car to?
//		2
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		2
//		Speed up by?
//		40
//		Speed: 50
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		3
//		Speed down by?
//		20
//		Speed :30
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		4
//		-----------------------FINAL STATE OF THE VEHICLE-------------------------
//		Speed      :: 30 units
//		Gear No.   :: 2
//		--------------------------------------------------------------------------
//		Which operation would you like to perform?
//		1. Change gear
//		2. Change speed
//		3. Apply brakes
//		4. Display state of the vehicle
//		5. Exit
//		5
//		Choose the vehicle from the following
//		1. Bike
//		2. Car
//		3. Bicycle
//		4. Exit
//		4
//------------------------------------------------------------------------------------------
