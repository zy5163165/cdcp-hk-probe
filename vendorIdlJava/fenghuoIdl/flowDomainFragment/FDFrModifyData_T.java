package flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public performance.AdministrativeState_T administrativeState;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public globaldefs.NameAndStringValue_T[][] tpNamesToRemove;
	public globaldefs.NameAndStringValue_T[][] aEndTPNames;
	public globaldefs.NameAndStringValue_T[][] zEndTPNames;
	public globaldefs.NameAndStringValue_T[][] internalTPNames;
	public globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public FDFrModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, performance.AdministrativeState_T administrativeState, transmissionParameters.LayeredParameters_T transmissionParams, globaldefs.NameAndStringValue_T[][] tpNamesToRemove, globaldefs.NameAndStringValue_T[][] aEndTPNames, globaldefs.NameAndStringValue_T[][] zEndTPNames, globaldefs.NameAndStringValue_T[][] internalTPNames, globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.tpNamesToRemove = tpNamesToRemove;
		this.aEndTPNames = aEndTPNames;
		this.zEndTPNames = zEndTPNames;
		this.internalTPNames = internalTPNames;
		this.additionalModificationInfo = additionalModificationInfo;
	}
}
