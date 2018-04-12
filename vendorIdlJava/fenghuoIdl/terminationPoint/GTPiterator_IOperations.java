package terminationPoint;

/**
 *	Generated from IDL interface "GTPiterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface GTPiterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, terminationPoint.GTPlist_THolder gtpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
