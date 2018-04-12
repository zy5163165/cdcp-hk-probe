package topologicalLink;

/**
 *	Generated from IDL definition of struct "TLCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TLCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TLCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public short rate;
	public globaldefs.NameAndStringValue_T[] aEndTP;
	public globaldefs.NameAndStringValue_T[] zEndTP;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TLCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.ConnectionDirection_T direction, short rate, globaldefs.NameAndStringValue_T[] aEndTP, globaldefs.NameAndStringValue_T[] zEndTP, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.rate = rate;
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
