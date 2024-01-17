package git115;

import java.util.Scanner;

public class add2nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan=new Scanner(System.in);
          int a,b,sum;
          System.out.println("Enter the two numbers");
          a=scan.nextInt();
          b=scan.nextInt();
          sum=a+b;
          System.out.println("The two numbers are "+sum);
	}

          
          public static int display(int a,int b) {
        	  int s;
        	   s=a-b;
        	   return s;
          
	
          }
}
