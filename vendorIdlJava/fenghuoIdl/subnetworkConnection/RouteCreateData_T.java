package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteCreateData_T(){}
	public java.lang.String intended = "";
	public java.lang.String exclusive = "";
	public subnetworkConnection.CrossConnect_T[] ccInclusions;
	public globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public RouteCreateData_T(java.lang.String intended, java.lang.String exclusive, subnetworkConnection.CrossConnect_T[] ccInclusions, globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, globaldefs.NameAndStringValue_T[][] neTpSncExclusions, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.intended = intended;
		this.exclusive = exclusive;
		this.ccInclusions = ccInclusions;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
