package FH_FaultAnalyzer;

/**
 *	Generated from IDL interface "FaultGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface FaultGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, FH_FaultAnalyzer.FaultGroupList_THolder faultGroupList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
