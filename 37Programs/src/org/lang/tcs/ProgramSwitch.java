package org.lang.tcs;

import java.util.Scanner;

public class ProgramSwitch {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		System.out.println("Enter operation key");
		String operator = sc.next();
		Integer result;
		switch (operator) {
		case "add":
		 result = num1+num2;
		 System.out.println(result);
		 break;
		 case "sub":
		result = num1-num2;
		System.out.println(result);
		break;
		 case "multiple":
          result = num1*num2;
          System.out.println(result);
  			break;
  			
          case "division":
        	  result = num1/num2;
        	  System.out.println(result);
  			 break;



		default:
			break;
		}
		
		}
	}


