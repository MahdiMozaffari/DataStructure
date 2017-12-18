// The name : Mahdi_Mozaffari  
// The_collegian number : 9511213529
package Graph;

public class NodeList {

	int info;
	AdjList listPtr;
	NodeList nodeNext;

   
	public NodeList ( int info , AdjList listPtr , NodeList nodeNext )
	{
		this.info = info ;
		this.listPtr = listPtr ;
		this.nodeNext = nodeNext ;
	}
	
	public int getinfo()
	{
		return info ;
	}
	public void setinfo( int info )
	{
		this.info = info ;
	}
	public AdjList getlistPtr()
	{
		return listPtr ;
	}
	public void setlistPtr(AdjList listPtr)
	{
		this.listPtr = listPtr ;
	}
	public NodeList getnodeNext()
	{
		return nodeNext ;
	}
	public void setnodeNext(NodeList nodeNext)
	{
		this.nodeNext = nodeNext ;
	}
}