package blz.logicalpgmday06;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
			int i, Num, Sum = 0 ;
			Scanner SC = new Scanner(System.in);		
			System.out.println(" Enter any Number: ");
			Num = SC.nextInt();

			for(i = 1 ; i < Num ; i++) {
				if(Num % i == 0)  {
					Sum = Sum + i;
				}
			}
			if (Sum == Num) {
				System.out.format(" is a Perfect Number", Num);
			}
			else {
				System.out.format(" is not a Perfect Number", Num);
				SC.close();
			}
		}
	}


