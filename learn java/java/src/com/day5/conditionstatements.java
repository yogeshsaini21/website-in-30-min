package com.day5;

public class conditionstatements {
	
	public static void main(String[] args) {
		//condition statements
		// voter eligiblity condition 
//		>,<,>=,<=
		//if the person age is less than 13 he is  eligible for scooty 
//		 if the person is greater then or equal to 13 but less then 18 is eligible for bike
//		if the person age is greate than or equal to 18 then he is elibgile for car
		int age=13;
		if(age<=13) {
			System.out.println("eligible for scooty");
		}
		else if(age>=13 || age<18) {
			System.out.println("eligible for bike");
		}
		else {
			System.out.println(" eligible for car");
		}
		
		
	}

}
