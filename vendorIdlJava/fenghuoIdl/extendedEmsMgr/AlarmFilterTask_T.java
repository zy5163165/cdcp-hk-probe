package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "AlarmFilterTask_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmFilterTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmFilterTask_T(){}
	public globaldefs.NameAndStringValue_T[] alarmFilterTaskName;
	public globaldefs.NameAndStringValue_T[] entityName;
	public java.lang.String nativeProbableCause = "";
	public java.lang.String ProbableCause = "";
	public notifications.PerceivedSeverity_T perceivedSeverity;
	public java.lang.String emsBeginTime;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public AlarmFilterTask_T(globaldefs.NameAndStringValue_T[] alarmFilterTaskName, globaldefs.NameAndStringValue_T[] entityName, java.lang.String nativeProbableCause, java.lang.String ProbableCause, notifications.PerceivedSeverity_T perceivedSeverity, java.lang.String emsBeginTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.alarmFilterTaskName = alarmFilterTaskName;
		this.entityName = entityName;
		this.nativeProbableCause = nativeProbableCause;
		this.ProbableCause = ProbableCause;
		this.perceivedSeverity = perceivedSeverity;
		this.emsBeginTime = emsBeginTime;
		this.additionalInfo = additionalInfo;
	}
}
