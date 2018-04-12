package callSNC;

/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnectionsAndSNCs_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnectionsAndSNCs_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallAndTopLevelConnectionsAndSNCs_T(){}
	public callSNC.Call_T theCall;
	public callSNC.ConnectionAndSupportingSNCs_T[] topLevelConnectionsAndSNCsList;
	public CallAndTopLevelConnectionsAndSNCs_T(callSNC.Call_T theCall, callSNC.ConnectionAndSupportingSNCs_T[] topLevelConnectionsAndSNCsList)
	{
		this.theCall = theCall;
		this.topLevelConnectionsAndSNCsList = topLevelConnectionsAndSNCsList;
	}
}
