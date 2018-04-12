package aSAP;

/**
 *	Generated from IDL interface "ASAPIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ASAPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, aSAP.ASAPList_THolder aSAPList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
