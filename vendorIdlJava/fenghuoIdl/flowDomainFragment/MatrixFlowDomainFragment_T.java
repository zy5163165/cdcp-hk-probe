package flowDomainFragment;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MatrixFlowDomainFragment_T(){}
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public globaldefs.NameAndStringValue_T[][] aEnd;
	public globaldefs.NameAndStringValue_T[][] zEnd;
	public boolean flexible;
	public boolean active;
	public java.lang.String mfdfrType;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomainFragment_T(globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, globaldefs.NameAndStringValue_T[][] aEnd, globaldefs.NameAndStringValue_T[][] zEnd, boolean flexible, boolean active, java.lang.String mfdfrType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
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
