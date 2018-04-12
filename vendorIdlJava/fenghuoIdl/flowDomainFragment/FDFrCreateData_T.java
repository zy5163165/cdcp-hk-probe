package flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrCreateData_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public globaldefs.ConnectionDirection_T direction;
	public performance.AdministrativeState_T administrativeState;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public boolean fullRoute;
	public java.lang.String fdfrType;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FDFrCreateData_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, globaldefs.ConnectionDirection_T direction, performance.AdministrativeState_T administrativeState, transmissionParameters.LayeredParameters_T transmissionParams, boolean fullRoute, java.lang.String fdfrType, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.direction = direction;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.fullRoute = fullRoute;
		this.fdfrType = fdfrType;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
