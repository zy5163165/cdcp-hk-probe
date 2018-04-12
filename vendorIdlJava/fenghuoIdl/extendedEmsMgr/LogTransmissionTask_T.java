package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "LogTransmissionTask_T"
 *	@author JacORB IDL compiler 
 */

public final class LogTransmissionTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LogTransmissionTask_T(){}
	public java.lang.String eventTypeName = "";
	public notifications.ObjectType_T[] objectTypeList;
	public boolean beCompressed;
	public java.lang.String beginTime;
	public java.lang.String endTime;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public LogTransmissionTask_T(java.lang.String eventTypeName, notifications.ObjectType_T[] objectTypeList, boolean beCompressed, java.lang.String beginTime, java.lang.String endTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.eventTypeName = eventTypeName;
		this.objectTypeList = objectTypeList;
		this.beCompressed = beCompressed;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.additionalInfo = additionalInfo;
	}
}
