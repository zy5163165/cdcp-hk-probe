package extendedEmsMgr;

/**
 *	Generated from IDL interface "BusinessCutOverPlanIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface BusinessCutOverPlanIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedEmsMgr.BusinessCutOverPlanList_THolder bcoPlanList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
