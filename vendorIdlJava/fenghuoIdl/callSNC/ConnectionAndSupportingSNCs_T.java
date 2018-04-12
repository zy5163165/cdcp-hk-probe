package callSNC;

/**
 *	Generated from IDL definition of struct "ConnectionAndSupportingSNCs_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionAndSupportingSNCs_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConnectionAndSupportingSNCs_T(){}
	public subnetworkConnection.SubnetworkConnection_T topLevelConnection;
	public subnetworkConnection.SubnetworkConnection_T[] sNCList;
	public ConnectionAndSupportingSNCs_T(subnetworkConnection.SubnetworkConnection_T topLevelConnection, subnetworkConnection.SubnetworkConnection_T[] sNCList)
	{
		this.topLevelConnection = topLevelConnection;
		this.sNCList = sNCList;
	}
}
