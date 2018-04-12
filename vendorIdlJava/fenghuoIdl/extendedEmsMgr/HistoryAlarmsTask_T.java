package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "HistoryAlarmsTask_T"
 *	@author JacORB IDL compiler 
 */

public final class HistoryAlarmsTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HistoryAlarmsTask_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public notifications.ObjectType_T[] objectTypeList;
	public java.lang.String[] excludeProbCauseList;
	public notifications.PerceivedSeverity_T[] excludeSeverityList;
	public java.lang.String beginTime;
	public java.lang.String endTime;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HistoryAlarmsTask_T(globaldefs.NameAndStringValue_T[] objectName, notifications.ObjectType_T[] objectTypeList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String beginTime, java.lang.String endTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectName = objectName;
		this.objectTypeList = objectTypeList;
		this.excludeProbCauseList = excludeProbCauseList;
		this.excludeSeverityList = excludeSeverityList;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.additionalInfo = additionalInfo;
	}
}
