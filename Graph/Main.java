// The name : Mahdi_Mozaffari
// The_collegian number : 9511213529
package Graph;
import java.util.Scanner ;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Question 5") ;
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
		
		int convertTo0_1[][] = graph.conversionTo_0_1( a ) ;
		System.out.println( );
		System.out.println("Path Matrix :") ;
		graph.Print(convertTo0_1) ;
		
		System.out.println( );
		System.out.println("Pure Weigh Matrix :") ;
		graph.PureWeigh(convertTo0_1);
		
		System.out.println("---------------------------------------------");
		System.out.println("Question 6") ;
		
		
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
		
		int conveeertTo0_1[][] = graph.conversionTo_0_1( a ) ;
		System.out.println( ) ;
		System.out.println(" Matrix0_1 :") ;
		graph.Print(conveeertTo0_1) ;
		
		System.out.println( ) ;
		System.out.println("Tedad Yall :") ;
		graph.Yall(conveeertTo0_1) ;
	}
}
