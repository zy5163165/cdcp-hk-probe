package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteNameAndAdminState_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteNameAndAdminState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteNameAndAdminState_T(){}
	public java.lang.String id = "";
	public java.lang.String administrativeState = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public RouteNameAndAdminState_T(java.lang.String id, java.lang.String administrativeState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.id = id;
		this.administrativeState = administrativeState;
		this.additionalInfo = additionalInfo;
	}
}
