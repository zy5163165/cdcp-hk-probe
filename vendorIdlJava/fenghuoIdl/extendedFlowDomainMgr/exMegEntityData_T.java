package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of struct "exMegEntityData_T"
 *	@author JacORB IDL compiler 
 */

public final class exMegEntityData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public exMegEntityData_T(){}
	public globaldefs.NameAndStringValue_T[] megName;
	public short megLayerRate;
	public globaldefs.NameAndStringValue_T[] assignedEntityName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public exMegEntityData_T(globaldefs.NameAndStringValue_T[] megName, short megLayerRate, globaldefs.NameAndStringValue_T[] assignedEntityName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.megName = megName;
		this.megLayerRate = megLayerRate;
		this.assignedEntityName = assignedEntityName;
		this.additionalInfo = additionalInfo;
	}
}
