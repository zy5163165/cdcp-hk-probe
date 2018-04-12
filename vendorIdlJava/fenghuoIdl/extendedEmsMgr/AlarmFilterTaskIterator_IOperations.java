package extendedEmsMgr;

/**
 *	Generated from IDL interface "AlarmFilterTaskIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface AlarmFilterTaskIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, extendedEmsMgr.AlarmFilterTaskList_THolder alarmFilterMaskList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
