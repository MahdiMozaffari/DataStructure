// The name : Mahdi_Mozaffari   
// The_collegian number : 9511213529
package Garph;
import java.util.Scanner ;

public class Graph {

	Scanner scan = new Scanner(System.in) ;
	
	public void Print( int a [][] )
	{
		
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				System.out.printf( "%d\t" , a[i][j] ) ;
			}
			System.out.println();
		}
	}
	
	// Polar : _Motegharen_
	// Edge : _Yall_
	// Respective : _Be Tartib_
	public void isPolar( int a [][] )
	{
		int flag = 0 ;
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				if ( i!=j && a[i][j] == a[j][i] )
					flag = 1 ;
			}
		}
		if ( flag == 0 )
		{
			System.out.println(" Your Matrix NOt Polar ") ;
			System.out.println("Number of edges are respectively nodes") ;
			int sum ;
			for ( int i = 0 ; i < 3 ; i++)
			{
				 sum = 0 ;
				for ( int j = 0 ; j < 3 ; j++ )
				{
				sum	+= (a[i][j] + a[j][i]) ;
				}
				System.out.println( sum ) ;
				System.out.println( ) ;
			}
		}
		else
		{
			System.out.println(" Your Matrix isPolar ") ;
			System.out.println(" Number of edges are respectively nodes :");
			int sum ;
			for ( int i = 0 ; i < 3 ; i++ )
			{
				 sum = 0 ;
				for ( int j = 0 ; j < 3 ; j++ )
				{
					sum += a[i][j] ;
				}
			System.out.println(sum) ;
			System.out.println( ) ;
			
			}
		}
	}
	
	public int[][] conversionTo_0_1 ( int convert [][] )
	{
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				if( convert[i][j] >= 1 )
					convert[i][j] = 1 ;
			}
		}
		return convert ;
	}
}
