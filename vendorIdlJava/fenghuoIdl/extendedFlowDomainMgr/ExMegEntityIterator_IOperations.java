package extendedFlowDomainMgr;

/**
 *	Generated from IDL interface "ExMegEntityIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ExMegEntityIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedFlowDomainMgr.ExMegEntityList_THolder megList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
