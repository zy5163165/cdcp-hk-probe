package performance;

/**
 *	Generated from IDL interface "PMPIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface PMPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, performance.PMPList_THolder pmpList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
