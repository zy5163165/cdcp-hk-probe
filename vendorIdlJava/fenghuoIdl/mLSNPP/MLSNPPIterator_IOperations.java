package mLSNPP;

/**
 *	Generated from IDL interface "MLSNPPIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface MLSNPPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
