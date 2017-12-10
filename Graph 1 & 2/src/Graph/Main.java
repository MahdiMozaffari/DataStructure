// The name : Mahdi_Mozaffari 
// The_collegian number : 9511213529
package Graph;
import java.util.Scanner ;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		
		int [][] a = new int [3][3] ;
		
		Graph graph = new Graph () ;
		System.out.println("Reply Question 1 : ") ;
		
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
		
		
	    int a2[][] = graph.Multiplier(a , a) ;
		System.out.println( );
		System.out.println("Show Multiplier :");
		System.out.println( );
		graph.Print(a2) ;
		
		
		int sum [][] = graph.Sum(a, a2) ;
		System.out.println( );
		System.out.println("Resulte sum matrixs :") ;
		graph.Print(sum) ;
		
		int ResultPathMatrix[][] = graph.conversionTo_0_1( sum ) ;
		System.out.println( );
		System.out.println("Path Matrix :") ;
		graph.Print(ResultPathMatrix) ;
		
		System.out.println("-----------------------------------------------") ;
		System.out.println("Reply Question 2 : ") ;
		
		
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
		
		int w[][] = graph.conversionTo_0_1( a ) ;
		System.out.println( ) ;
		// Matrix 0 || 1 is Matrix_Mojaverat
		System.out.println("Weigh Matrix convert to Matrix 0 & 1 : ") ;
		System.out.println( ) ;
		graph.Print(w) ;
		
		  int w2[][] = graph.Multiplier(w , w) ;
		  System.out.println( );
		  System.out.println("Show Multiplier :");
		  System.out.println( );
		  graph.Print(w2) ;
			
		  int sum1 [][] = graph.Sum(w, w2) ;
		  System.out.println( );
		  System.out.println("Resulte sum matrixs :") ;
		  graph.Print(sum1) ;
		
		  int ResultPathMatrix1[][] = graph.conversionTo_0_1( sum1 ) ;
			System.out.println( );
			System.out.println("Path Matrix :") ;
			graph.Print(ResultPathMatrix1) ;
	}

}
