// The name : Mahdi_Mozaffari
// The_collegian number : 9511213529
package Graph;

import java.util.Scanner ; 

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Question 3") ;
		int a[][] = new int[3][3] ;
		
		Scanner scan = new Scanner(System.in) ;
		
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
		System.out.println("Source Node Exist Or Not Exist ?!");
		System.out.println( ) ;
		graph.isSource(a) ;
		
		System.out.println("-------------------------------------------------") ;
		System.out.println("Question 4 :") ;
		
		System.out.println("Row :");
		int Row1 = scan.nextInt() ; 
		
		System.out.print("solumn :") ;
		int column1 = scan.nextInt() ;
		
		System.out.println("Enter the ideal elements :");
		for ( int i = 0 ; i < Row1 ; i++ )
		{
			for ( int j = 0 ; j < column1 ; j++ )
			{
				a[i][j] = scan.nextInt() ;
			}
		}
		System.out.println("Your matrix :");
		graph.Print(a) ;
		
		System.out.println( ) ;
		System.out.println("Sink Node Exist Or Not Exist ?!");
		System.out.println( ) ;
		graph.isSink(a) ;
	}

}
