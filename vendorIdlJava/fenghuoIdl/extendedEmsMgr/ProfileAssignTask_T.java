package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "ProfileAssignTask_T"
 *	@author JacORB IDL compiler 
 */

public final class ProfileAssignTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProfileAssignTask_T(){}
	public globaldefs.NameAndStringValue_T[] profileName;
	public globaldefs.NameAndStringValue_T[][] entityNames;
	public short layer;
	public java.lang.String dataType = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ProfileAssignTask_T(globaldefs.NameAndStringValue_T[] profileName, globaldefs.NameAndStringValue_T[][] entityNames, short layer, java.lang.String dataType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.profileName = profileName;
		this.entityNames = entityNames;
		this.layer = layer;
		this.dataType = dataType;
		this.additionalInfo = additionalInfo;
	}
}
