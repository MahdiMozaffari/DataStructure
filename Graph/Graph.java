// The name : Mahdi_Mozaffari
// The_collegian number : 9511213529
package Graph;
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
	// Pure : _khales
	public void PureWeigh ( int a[][] )
	{
	int sum1 = ( a[0][0] + a[1][0] + a[2][0] ) - ( a[0][0] + a[0][1] + a[0][2] ) ;
	int sum2 = ( a[0][1] + a[1][1] + a[2][1] ) - ( a[1][0] + a[1][1] + a[1][2] ) ;
	int sum3 = ( a[0][2] + a[1][2] + a[2][2] ) - ( a[2][0] + a[2][1] + a[2][2] ) ;
		
	System.out.println("Head1 :" + sum1) ;
	System.out.println("Head2 :" + sum2) ;
	System.out.println("Head3 :" + sum3);
	}
	
	public void Yall( int a[][] )
	{
		int count = 0 ;
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
		     if( a[i][j] == 1 )
		    	 count ++ ;
			}
		}
		System.out.println(count);
	}
	
}
