package flowDomainFragment;

/**
 *	Generated from IDL interface "MFDFrIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface MFDFrIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
