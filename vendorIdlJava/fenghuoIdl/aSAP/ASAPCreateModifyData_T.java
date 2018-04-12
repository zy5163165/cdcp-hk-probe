package aSAP;

/**
 *	Generated from IDL definition of struct "ASAPCreateModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAPCreateModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ASAPCreateModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public aSAP.AlarmSeverityAssignment_T[] alarmSeverityAssignmentList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ASAPCreateModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, aSAP.AlarmSeverityAssignment_T[] alarmSeverityAssignmentList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.alarmSeverityAssignmentList = alarmSeverityAssignmentList;
		this.additionalInfo = additionalInfo;
	}
}
