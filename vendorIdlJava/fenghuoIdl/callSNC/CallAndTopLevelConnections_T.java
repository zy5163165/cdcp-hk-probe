package callSNC;

/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnections_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnections_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallAndTopLevelConnections_T(){}
	public callSNC.Call_T theCall;
	public subnetworkConnection.SubnetworkConnection_T[] topLevelConnectionsList;
	public CallAndTopLevelConnections_T(callSNC.Call_T theCall, subnetworkConnection.SubnetworkConnection_T[] topLevelConnectionsList)
	{
		this.theCall = theCall;
		this.topLevelConnectionsList = topLevelConnectionsList;
	}
}
