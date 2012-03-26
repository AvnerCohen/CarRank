package com.israbirding.drools;

public class DroolsHelper{  
  
     public static double calculateSalary(double salary, double carValue, double newBaseSalary, double newCarValue){  
    	 	
    	 double retSalary = 0.0;
    	 double currentTotal  = salary + carValue;
    	 double newTotal  = newBaseSalary + newCarValue;
    	 if (newTotal / currentTotal  <  1.2 )
    	 {
    		 retSalary = (salary - newCarValue) * 1.2;
    	 }
    	 else
    	 {
    		 retSalary =  newTotal;
    	 }
    	 System.out.println("New Calculated salary:" + retSalary);
    	 return retSalary;
     }  
  
} 