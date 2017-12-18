// The name : Mahdi_Mozaffari 
// The_collegian number : 9511213529
package Graph;

public class AdjList {
	
	int info ;
	AdjList listPtr ;
	
	  
		public AdjList ( int info , AdjList listPtr )
		{
			this.info = info ;
			this.listPtr = listPtr ;
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
}