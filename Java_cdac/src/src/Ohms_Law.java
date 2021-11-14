package src;
import java.util.*;  
import java.util.Scanner;

public class Ohms_Law 
{

	public static void main(String[] args) 
	{
        double voltage;
        double resistance;
        double current;
	System.out.println("Enter the value of Voltage");
		Scanner sc=new Scanner(System.in);
		 voltage=sc.nextDouble();
		 System.out.println("Enter the value of Resistance");
		 resistance=sc.nextDouble();
		 
		 current=voltage/resistance;
		 System.out.println("The current is "+current);
	}

}
/*Enter the value of Voltage
230
Enter the value of Resistance
10
The current is 23.0
.*/