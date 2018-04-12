package extendedEmsMgr;

/**
 *	Generated from IDL interface "AlarmReportingMaskIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface AlarmReportingMaskIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedEmsMgr.AlarmReportingMaskList_THolder alarmReportingMaskList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
