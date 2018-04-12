package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "NamePair_T"
 *	@author JacORB IDL compiler 
 */

public final class NamePair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public NamePair_T(){}
	public globaldefs.NameAndStringValue_T[][] preName;
	public globaldefs.NameAndStringValue_T[][] afterName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public NamePair_T(globaldefs.NameAndStringValue_T[][] preName, globaldefs.NameAndStringValue_T[][] afterName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.preName = preName;
		this.afterName = afterName;
		this.additionalInfo = additionalInfo;
	}
}
