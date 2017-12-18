// The name : Mahdi_Mozaffari 
// The_collegian number : 9511213529
package Graph;

public class Graph {

	public NodeList Graph = null;

	/** Item is for select branch */
	public void addToNodeList(int y, int x) {
		NodeList n = new NodeList(y, null, null);
		AdjList m = new AdjList(x, null);
		NodeList ptr = Graph;

		if (Graph == null)
			Graph = n;

		else {
			while (ptr.getnodeNext() != null)
				ptr = ptr.getnodeNext();
			ptr.setnodeNext(n);
		}

		ptr = Graph;
		while (ptr.getinfo() != y) {
			ptr = ptr.getnodeNext();
		}

		AdjList str = ptr.listPtr;
		while (str.getlistPtr() != null) {
			str = str.getlistPtr();
		}
		str.setlistPtr(m);
	}

	public void addToNodeList1(int i, int j) {
		
		NodeList n = new NodeList(i, null, null);
		AdjList m = new AdjList(j, null);

		NodeList ptr = Graph;
		AdjList str = ptr.listPtr ;
	
		while ( ptr != null )
		{
			if( ptr.getinfo() == i )
			{
				str.setinfo(j);
				ptr.setlistPtr(str.getlistPtr());
			}
		}

	}

	public void show() {
		NodeList ptr = Graph;
		AdjList str;

		while (ptr != null) {
			System.out.println(ptr.getinfo());
			str = ptr.listPtr;
			while (str != null) {
				System.out.println();
				System.out.println("AdjList Node :");
				System.out.println(str.getinfo());
				str = str.getlistPtr();
			}
			ptr = ptr.getnodeNext();
		}
	}
}
