package com.bridgelab.day10;

import java.util.Random;
class Employee{
	int present = 1;
	int absent = 0;
	int wagePerHr = 20;
	int workingHrs = 8;
	int partTimehr = 4;
	int dailyWage =0;
	int partTime = 2;
	Random ran = new Random();
	int fullDayWage =0;
	int partTimeWage = 0;


	// UC3_Check Employee is Present or Absent
	public void checkAbsentOrPresent() {
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(2);
			if(check==present) {
				System.out.println("Day" + i + ": Employee is present");
			}
			else {
				System.out.println("Day" + i + ": Employee is absent");
			}
		}
	}
	// UC2_Calculate Daily Wage
	public void calculateDailyWage() {
		//			dailyWage = dailyWage + empWageperHr*empDayhr;
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(2);
			if(check==present) {
				System.out.println("Day" + i + ": Employee is present and"
						+ " today's emplyee wage is: " + wagePerHr*workingHrs );
			}
			else {
				System.out.println("Day" + i + ": Employee is absent");
			}
		}
	}

	// UC_3 Add Part time employee & wage
	public void calculateDailyWage1() {
		//			dailyWage = dailyWage + empWageperHr*empDayhr;
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(3);
			if(check==present) {
				System.out.println("Day" + i + ": Employee is present and "
						+ "today's emplyee wage is: " + wagePerHr*workingHrs );
			}
			else if (check == partTime) {
				System.out.println("Day" + i + ": Employee is part time doing  and"
						+ " today's emplyee wage is: " + wagePerHr*partTimehr );
			}
			else {
				System.out.println("Day" + i + ": Employee is absent");
			}
		}
	}

	// UC4_Using Switch Case Statement
	public void switchCase() {
		for(int i= 0; i<=20; i++) {
			int check = ran.nextInt(3);
			switch(check) {
			case 1:
				System.out.println("Day" + i + ": Employee is present and "
						+ "today's emplyee wage is: " + wagePerHr*workingHrs );

				break;

			case 2:
				System.out.println("Day" + i + ": Employee is part time doing  and"
						+ " today's emplyee wage is: " + wagePerHr*partTimehr );

				break;

			case 0:
				System.out.println("Day" + i + ": Employee is absent");
				break;
			}	

		}

	}

	// UC5_ Calculating Wage for a month
	public void calculateWageForMonth(int wagePerHr, int workingHrs, int workingDays) {
		for(int i= 0; i<=workingDays; i++) {
			int check = ran.nextInt(3);
			switch(check) {
			case 1:
				System.out.println("Day" + i + ": Employee is present and "
						+ "today's emplyee wage is: " + wagePerHr*workingHrs );
				fullDayWage += wagePerHr*workingHrs;
				break;

			case 2:
				System.out.println("Day" + i + ": Employee is part time doing  and"
						+ " today's emplyee wage is: " + wagePerHr*partTimehr );
				partTimeWage += wagePerHr*partTimehr;
				break;

			case 0:
				System.out.println("Day" + i + ": Employee is absent");
				break;
			}	

		}
		System.out.println("Employee wage for a month = "+ (fullDayWage+partTimeWage));
		
	}
}

public class Day10_employeeWage {
	int fullDayWage =0;
	Random ran = new Random();
	public void calculateWageForMonth(int wagePerHr, int workingHrs, int workingDays) {
		for(int i= 0; i<=workingDays; i++) {
			int check = ran.nextInt(2);
			switch(check) {
			case 1:
				System.out.println("Day" + i + ": Employee is present and "
						+ "today's emplyee wage is: " + wagePerHr*workingHrs );
				fullDayWage += wagePerHr*workingHrs;
				break;

			case 0:
				System.out.println("Day" + i + ": Employee is absent");
				break;
			}	

		}
		System.out.println("Employee wage for a month = "+ (fullDayWage));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day10_employeeWage dmart = new Day10_employeeWage();
		dmart.calculateWageForMonth(20, 8, 20);
		
		Day10_employeeWage reliance = new Day10_employeeWage();
		reliance.calculateWageForMonth(20, 8, 20);

	}


}
