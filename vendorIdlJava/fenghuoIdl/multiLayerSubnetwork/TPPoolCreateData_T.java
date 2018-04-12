package multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "TPPoolCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPPoolCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TPPoolCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public multiLayerSubnetwork.MultiLayerSubnetwork_T containingMLSN;
	public globaldefs.NameAndStringValue_T[][] containedMembers;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String descriptionOfUse = "";
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TPPoolCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, multiLayerSubnetwork.MultiLayerSubnetwork_T containingMLSN, globaldefs.NameAndStringValue_T[][] containedMembers, transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String descriptionOfUse, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.containingMLSN = containingMLSN;
		this.containedMembers = containedMembers;
		this.transmissionParams = transmissionParams;
		this.descriptionOfUse = descriptionOfUse;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
