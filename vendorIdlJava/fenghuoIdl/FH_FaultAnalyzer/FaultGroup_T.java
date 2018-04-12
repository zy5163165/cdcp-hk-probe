package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of struct "FaultGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FaultGroup_T(){}
	public FH_FaultAnalyzer.FilterAlarm_T[] filterAlarms;
	public FH_FaultAnalyzer.ProcessPrivilege_T[] suggestedPPR;
	public FaultGroup_T(FH_FaultAnalyzer.FilterAlarm_T[] filterAlarms, FH_FaultAnalyzer.ProcessPrivilege_T[] suggestedPPR)
	{
		this.filterAlarms = filterAlarms;
		this.suggestedPPR = suggestedPPR;
	}
}
