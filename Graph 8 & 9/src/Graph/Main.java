// The name : Mahdi_Mozaffari  
// The_collegian number : 9511213529
package Graph;
import java.util.Scanner ;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in) ;
		Graph graph = new Graph() ;
		
		System.out.println("Enter NodeList And AdjList and ideal Branch ") ;
		graph.addToNodeList1(scan.nextInt(), scan.nextInt()) ;
		
		graph.show();
		

	}

}
