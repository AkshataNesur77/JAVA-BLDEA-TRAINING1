/**
 * 
 */
package bldeatraining1;

/**
 * @author nesur
 *
 */
import java.util.Scanner;
public class Prog11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			int c=n*n;
			for(int j=1;j<=n;j++) {
				System.out.print(c+" ");
				c--;
			}
			System.out.println();
		}

	}

}
