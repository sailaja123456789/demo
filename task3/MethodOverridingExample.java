package practice;
class Vehicle{ 
	 void run(){System.out.println("Vehicle is running");}  
	}  

	   

public class MethodOverridingExample extends Vehicle {
	  public static void main(String args[]){  
		  //creating an instance of child class  
		  MethodOverridingExample obj = new MethodOverridingExample();  
		  
		  obj.run();  
}}
	
	
	
	
	


