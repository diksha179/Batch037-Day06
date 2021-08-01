package blz.logicalpgmday06;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	        int num, i, count=0;
	        Scanner SC = new Scanner(System.in);
			
	        System.out.print("Enter a Number : ");
	        num = SC.nextInt();
			
	        for(i=2; i<num; i++)
	        {
	            if(num%i == 0)
	            {
	              count++;
	            }
	        }
	        if(count == 0)
	        {
	            System.out.print("This is a Prime Number");
	        }
	        else
	        {
	            System.out.print("This is not a Prime Number");
	        }
	            SC.close();
	        }
	    
	}
		       
		           
