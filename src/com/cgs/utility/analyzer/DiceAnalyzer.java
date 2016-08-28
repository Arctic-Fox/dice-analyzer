package com.cgs.utility.analyzer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceAnalyzer {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main (String args[]){
		int numberOfRolls = 0;
		
		numberOfRolls = getNumberOfRolls();
		ArrayList<Integer> data = gatherData(numberOfRolls);
		float result = 0;
		result = AnalyzerCore.getAverage(data.toArray(new Integer[data.size()]));
		
		System.out.println("Average roll is " + String.format("%.1f", result));
	}
	
	private static ArrayList<Integer> gatherData(int numberOfRolls){

		ArrayList<Integer> dataList = new ArrayList<Integer>();

		for(int i = 0; i < numberOfRolls; i++) { 
			int value = 0;
			try{
				System.out.print("Waiting (" + (numberOfRolls - i) + " rolls remaining)...");
				value = keyboard.nextInt();
				if(value > 0 && value < 7){
					dataList.add(value);
				}
				else {
					System.out.println("Discarding value " + value);
					i--;
				}
			}
			catch (InputMismatchException e){
				System.out.println("Please enter an integer.");
				i--;
			} 
		}
		keyboard.close();
		return dataList;
	}
	
	private static int getNumberOfRolls(){

		boolean goodNumberFormat = false;
		int rolls = 0;
		
		while(!goodNumberFormat){
			System.out.print("Enter number of rolls:");
			try{
				rolls = keyboard.nextInt();
				if(rolls == 0){
					System.out.println("Please enter an integer greater than zero.");
				} 
				else {
					goodNumberFormat = true;
				}
			} 
			catch (InputMismatchException e){
				System.out.println("Please enter an integer.");
			} 
		}
		return rolls;
	}
}