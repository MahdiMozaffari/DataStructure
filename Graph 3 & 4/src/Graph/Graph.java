// The name : Mahdi_Mozaffari
// The_collegian number : 9511213529
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
	
	public void isSource( int a[][] )
	{
		int count = 0 ;
		int Degree = 0 ;
		for ( int j = 0 ; j < 3 ; j++ )
		{		
			Degree = 0 ;
			
			for ( int i = 0 ; i < 3 ; i++ )
			{
				 Degree  = Degree + a[i][j] ;
			}
			if ( Degree == 0 )
				count++ ;
		}
		if( count >= 1 )
			System.out.println(" Source Node Exist ");
		else
			System.out.println(" Source Node Not Exist ");
	}
	
	public void isSink ( int a[][] )
	{
		int count = 0 ;
		int degree = 0 ;
		for ( int i = 0 ; i < 3 ; i++ )
		{
			degree = 0 ;
			for ( int j = 0 ; j < 3 ; j++ )
			{
				degree += a[i][j] ;
			}
			if( degree == 0 )
				count ++ ;
		}
		if( count >= 1)
			System.out.println(" Sink Node Exist ");
		else
			System.out.println(" Sink Node Not Exist ");
	}
	
	// dar_sorat_dashtan_matrix_vazn_estefade_mishavad_mthode_zir
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
