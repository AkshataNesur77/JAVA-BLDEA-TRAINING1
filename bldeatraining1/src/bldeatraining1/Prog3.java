/**
 * 
 */
package bldeatraining1;

/**
 * @author nesur
 *
 */
import java.util.Scanner;
public class Prog3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age:");
	int age = sc.nextInt();
	if(age<18) {
		System.out.println("Minor");
	}
	else if(age>65) {
		System.out.println("Senior Citizen");
	}
	else {
		System.out.println("Most Eligible Bachelor");
	}

	}

}
