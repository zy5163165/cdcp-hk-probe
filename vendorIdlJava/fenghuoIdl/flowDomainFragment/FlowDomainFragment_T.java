package flowDomainFragment;

import java.util.Arrays;

/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FlowDomainFragment_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public java.lang.String networkAccessDomain = "";
	public boolean flexible;
	public performance.AdministrativeState_T administrativeState;
	public subnetworkConnection.SNCState_T fdfrState;
	public java.lang.String fdfrType;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomainFragment_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, java.lang.String networkAccessDomain, boolean flexible, performance.AdministrativeState_T administrativeState, subnetworkConnection.SNCState_T fdfrState, java.lang.String fdfrType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.networkAccessDomain = networkAccessDomain;
		this.flexible = flexible;
		this.administrativeState = administrativeState;
		this.fdfrState = fdfrState;
		this.fdfrType = fdfrType;
		this.additionalInfo = additionalInfo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlowDomainFragment_T [aEnd=" + Arrays.toString(aEnd)
				+ ", additionalInfo=" + Arrays.toString(additionalInfo)
				+ ", administrativeState=" + administrativeState
				+ ", direction=" + direction + ", fdfrState=" + fdfrState
				+ ", fdfrType=" + fdfrType + ", flexible=" + flexible
				+ ", name=" + Arrays.toString(name) + ", nativeEMSName="
				+ nativeEMSName + ", networkAccessDomain="
				+ networkAccessDomain + ", owner=" + owner
				+ ", transmissionParams=" + transmissionParams + ", userLabel="
				+ userLabel + ", zEnd=" + Arrays.toString(zEnd) + "]";
	}
}