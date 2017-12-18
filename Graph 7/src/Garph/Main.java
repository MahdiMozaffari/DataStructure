// The name : Mahdi_Mozaffari  
// The_collegian number : 9511213529
package Garph;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		int a[][] = new int[3][3] ;
		
		Graph graph = new Graph () ;
		
		System.out.println("Row :");
		int Row = scan.nextInt() ; 
		
		System.out.print("solumn :") ;
		int column = scan.nextInt() ;
		
		System.out.println("Enter the ideal elements :");
		for ( int i = 0 ; i < Row ; i++ )
		{
			for ( int j = 0 ; j < column ; j++ )
			{
				a[i][j] = scan.nextInt() ;
			}
		}
		System.out.println("Your matrix :");
		graph.Print(a) ;
		
		System.out.println( ) ;
		graph.isPolar(a) ;	

	}

}
