// the name : Mahdi_Mozaffari 
// the_collegian number : 9511213529

package Graph_1;
import java.util.Scanner;

public class Graph {

	Scanner scan = new Scanner(System.in) ;

	int [][] a = new int [2][2] ;
	int [][] b = new int [2][2] ;
	int [][] c = new int [2][2] ;
	
	public void Read( int a [][] )
	{	
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				a[i][j] = scan.nextInt() ;
			}
		}
	}
	
	public void Print( int a [][] )
	{
		
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				System.out.printf( "%d\t" , a[i][j] ) ;
				System.out.println( ) ;
			}
		}
	}
	
	// Multiplier : ZARB 
	public void Multiplier( int a [][] )
	{
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				c[i][j] = 0 ;
				for ( int k = 0 ; k < 3 ; k++ )
					c[i][j] = c[i][j] + a[i][k] * a[k][j] ;
			}
		}
	}
	
	public void Sum( int a [][] ,int  b [][] )
	{
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
				c[i][j] = a[i][j] + b[i][j] ;
		}
	}
}
