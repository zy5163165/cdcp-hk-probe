package softwareAndDataManager;

/**
 *	Generated from IDL interface "BackupIdIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface BackupIdIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, softwareAndDataManager.BackupIdList_THolder backupList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
