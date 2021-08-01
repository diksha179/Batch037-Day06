package blz.JUnitPrograms;
import java.util.Scanner;
public class VendingMachineChange {

	public static void main(String[] args) {

    Scanner SC = new Scanner(System.in);

    int itemCost = 0;
    int moneyInserted = 0;
    int changeLeft = 0;
    int hundred = 0;
    int fifty = 0;
    int twenty = 0;
    int ten = 0;
    int five = 0;
  

    System.out.println("Item cost?");
    itemCost = SC.nextInt();

    System.out.println("Amount given?");
    moneyInserted = SC.nextInt();

    changeLeft = moneyInserted - itemCost;

    hundred = changeLeft / 100;
    changeLeft = changeLeft % 100;

    fifty = changeLeft / 50;
    changeLeft = changeLeft % 50;

    twenty = changeLeft / 20;
    changeLeft = changeLeft % 20;

    ten = changeLeft / 10;
    changeLeft = changeLeft % 10;

    five = changeLeft / 5;
    changeLeft = changeLeft % 5;

  
    System.out.println("Change Due($): \n" + hundred + " Hundred\n" + fifty + " Fifty\n" + twenty + " Twenty\n" + ten + " Ten\n" + five + "five\n" );
    SC.close();
	}
	
}