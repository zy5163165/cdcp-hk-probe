package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of struct "exFdFrCreateAdditionalData_T"
 *	@author JacORB IDL compiler 
 */

public final class exFdFrCreateAdditionalData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public exFdFrCreateAdditionalData_T(){}
	public boolean fullRoute;
	public boolean forceUniqueness;
	public subnetworkConnection.Reroute_T rerouteAllowed;
	public subnetworkConnection.NetworkRouted_T networkRouted;
	public short layerRate;
	public globaldefs.NameAndStringValue_T[][] inclusionResource;
	public globaldefs.NameAndStringValue_T[][] exclusionResource;
	public extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] ccInclusions;
	public extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] backupCCInclusions;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public exFdFrCreateAdditionalData_T(boolean fullRoute, boolean forceUniqueness, subnetworkConnection.Reroute_T rerouteAllowed, subnetworkConnection.NetworkRouted_T networkRouted, short layerRate, globaldefs.NameAndStringValue_T[][] inclusionResource, globaldefs.NameAndStringValue_T[][] exclusionResource, extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] ccInclusions, extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] backupCCInclusions, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.fullRoute = fullRoute;
		this.forceUniqueness = forceUniqueness;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.layerRate = layerRate;
		this.inclusionResource = inclusionResource;
		this.exclusionResource = exclusionResource;
		this.ccInclusions = ccInclusions;
		this.backupCCInclusions = backupCCInclusions;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
