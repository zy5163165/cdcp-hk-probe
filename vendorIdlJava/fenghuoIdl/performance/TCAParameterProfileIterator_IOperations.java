package performance;

/**
 *	Generated from IDL interface "TCAParameterProfileIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TCAParameterProfileIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, performance.TCAParameterProfileList_THolder tcaParameterProfileList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
