package jetFleet;

import java.util.Scanner;

public class Hanger extends Jets {

	public static void main(String[] args) {

		int option;
		boolean quit = false;
		CombatJet RedBaron = new CombatJet("Authentic Red Baron Reproduction", 1000, 750, 2000000, 2, 2);
		CombatJet StealthBomber = new CombatJet("Stealth Bomber", 2000, 2400, 80000000, 4, 800);
		PersonalJet AirBoat = new PersonalJet("Personal Air Ship",900,3000,850000,90,60);

		Jets list[] = { RedBaron, StealthBomber, AirBoat };

		Scanner keyboard = new Scanner(System.in);

		do {
			printMenu();
			option = keyboard.nextInt();

			switch (option) {

			case 1:
				for (int i = 0; i < list.length; i++) {
					System.out.println(list[i]);
					System.out.println();
				}
				break;
			case 2:
				System.out.println(fastest(list));
				break;
			case 3: System.out.println(longestRange(list));
				break;
			case 4: list = addJet(list);
				System.out.println("Thank you for your purchase. Enjoy your new Jet!");
				for (int i = 0; i < list.length; i++) {
					System.out.println(list[i]);
				}
				break;
			case 5: System.out.println("Come back and visit any time!");
				quit = true;
				break;
			default:
				System.out.println("Invalid Response. Please Enter 1-5.");
				break;
			}
		} while (quit == false);
		keyboard.close();
	}

	public static void printMenu() {
		System.out.println("*****************************");
		System.out.println("****WELCOME TO THE HANGER****");
		System.out.println("*****************************");
		System.out.println("What can I do for you today?");
		System.out.println();
		System.out.println("Option 1: \tList Fleet");
		System.out.println("Option 2: \tView Fastest Jet");
		System.out.println("Option 3: \tView Jet with the Longest Range");
		System.out.println("Option 4: \tAdd a Fet to the Fleet");
		System.out.println("Option 5: \tQuit");
		System.out.println();
		System.out.println("Please select an option.");
		System.out.println();

	}

	public static Jets fastest(Jets[] list) {
		Jets fastest = list[0];
		double speed = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i].getSpeed() > speed) {
				speed = list[i].getSpeed();
				fastest = list[i];
				
			}
		}
		return fastest;
	}

	public static Jets longestRange(Jets[] list){
		Jets range = list[0];
		double maxRange = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i].getRange() > maxRange){
				maxRange = list[i].getRange();
				range = list[i];
			
			}
		}
		return range;
	}
	
	public static Jets[] addJet(Jets[] list){
		Scanner keyboard = new Scanner(System.in);
		Jets increasedArray[] = new Jets[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			increasedArray[i] = list[i];
		}
		String nameOfJet;
		double speed;
		double range;
		float price;
//		int capacity;
		System.out.println("What would you like to name your new jet?");
		nameOfJet = keyboard.next();
		System.out.println("How fast do you want this thing to go?");
		speed = keyboard.nextDouble();
		System.out.println("How far would you like your jet to be able t travel?");
		range = keyboard.nextDouble();
		System.out.println("How much of a down payment would you like to make?");
		price = keyboard.nextFloat();
//		System.out.println("What would you like the maximum occupancy to be?");
//		capacity = keyboard.nextInt();
		Jets newJet = new Jets(nameOfJet, speed, range, price);
		increasedArray[(list.length)] = newJet;
		keyboard.close();
	
		return increasedArray;
	}

	// sample combat jet
	// CombatJet redBaron = new CombatJet("Gunner", 800,600,130_000,2,2);

	// tested to make sure everything was displaying properly
	// System.out.println(redBaron);

}
