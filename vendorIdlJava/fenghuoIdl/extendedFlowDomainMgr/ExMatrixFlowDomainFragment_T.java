package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of struct "ExMatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class ExMatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ExMatrixFlowDomainFragment_T(){}
	public globaldefs.NameAndStringValue_T[] exMFdFrName;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public boolean flexible;
	public boolean active;
	public java.lang.String mfdfrType;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ExMatrixFlowDomainFragment_T(globaldefs.NameAndStringValue_T[] exMFdFrName, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, boolean flexible, boolean active, java.lang.String mfdfrType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.exMFdFrName = exMFdFrName;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.flexible = flexible;
		this.active = active;
		this.mfdfrType = mfdfrType;
		this.additionalInfo = additionalInfo;
	}
}
