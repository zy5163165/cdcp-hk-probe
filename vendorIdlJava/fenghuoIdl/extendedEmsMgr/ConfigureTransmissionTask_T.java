package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "ConfigureTransmissionTask_T"
 *	@author JacORB IDL compiler 
 */

public final class ConfigureTransmissionTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConfigureTransmissionTask_T(){}
	public globaldefs.NameAndStringValue_T[][] objectNameList;
	public notifications.ObjectType_T[] objectTypeList;
	public boolean beCompressed;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ConfigureTransmissionTask_T(globaldefs.NameAndStringValue_T[][] objectNameList, notifications.ObjectType_T[] objectTypeList, boolean beCompressed, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectNameList = objectNameList;
		this.objectTypeList = objectTypeList;
		this.beCompressed = beCompressed;
		this.additionalInfo = additionalInfo;
	}
}
