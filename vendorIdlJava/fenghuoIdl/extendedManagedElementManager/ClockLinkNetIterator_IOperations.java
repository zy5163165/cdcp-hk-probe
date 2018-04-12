package extendedManagedElementManager;

/**
 *	Generated from IDL interface "ClockLinkNetIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ClockLinkNetIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedManagedElementManager.ClockLinkNetList_THolder clockLinkNetList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
