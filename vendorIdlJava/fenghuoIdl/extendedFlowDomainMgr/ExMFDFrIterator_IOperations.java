package extendedFlowDomainMgr;

/**
 *	Generated from IDL interface "ExMFDFrIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ExMFDFrIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder mfdfrList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
