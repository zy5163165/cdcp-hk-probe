package softwareAndDataManager;

/**
 *	Generated from IDL definition of struct "BackupId_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupId_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BackupId_T(){}
	public globaldefs.NameAndStringValue_T[] meName;
	public java.lang.String backupTime;
	public BackupId_T(globaldefs.NameAndStringValue_T[] meName, java.lang.String backupTime)
	{
		this.meName = meName;
		this.backupTime = backupTime;
	}
}
