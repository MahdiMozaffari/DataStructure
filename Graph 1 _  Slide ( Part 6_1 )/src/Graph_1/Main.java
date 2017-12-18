
// question 1 : Find the path matrix from the Neighborhood matrix 

// the name : Mahdi_Mozaffari
// the_collegian number : 9511213529
package Graph_1;

public class Main {

	public static void main(String[] args) {
		
		int [][] a = new int [2][2] ;
		int [][] b = new int [2][2] ;
		int [][] c = new int [2][2] ;
		
		Graph graph = new Graph() ;
		
		graph.Read(a) ;
		graph.Multiplier(a) ;
		graph.Sum(a, c) ;
		graph.Print(c) ;
	}

}
