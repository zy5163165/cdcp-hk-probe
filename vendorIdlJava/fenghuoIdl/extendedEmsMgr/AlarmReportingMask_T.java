package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "AlarmReportingMask_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmReportingMask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmReportingMask_T(){}
	public globaldefs.NameAndStringValue_T[] entityName;
	public java.lang.String owner = "";
	public short layerRate;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public AlarmReportingMask_T(globaldefs.NameAndStringValue_T[] entityName, java.lang.String owner, short layerRate, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.entityName = entityName;
		this.owner = owner;
		this.layerRate = layerRate;
		this.additionalInfo = additionalInfo;
	}
}
