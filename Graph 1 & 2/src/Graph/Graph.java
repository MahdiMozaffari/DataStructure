// The name : Mahdi_Mozaffari  
// The_cpllegian number : 9511213529

package Graph;

import java.util.Scanner;

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
	
	// Multiplier : ZARB 
	public int[][] Multiplier( int a [][] , int c [][] )
	{
		int b [][] = new int [3][3] ;
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				b[i][j] = 0 ;
				for ( int k = 0 ; k < 3 ; k++ )
					b[i][j] = b[i][j] + a[i][k] * c[k][j] ;
			}
		}
		return b ;	
	}
	
	public int[][] Sum( int a [][] ,int  b [][] )
	{
		int [][] c = new int[3][3] ;
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
				c[i][j] = a[i][j] + b[i][j] ;
		}
		return c ;
	}
	
	// conversionTo_0_1 : mojaverat_matrix
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
