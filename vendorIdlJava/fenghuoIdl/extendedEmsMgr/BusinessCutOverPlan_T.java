package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "BusinessCutOverPlan_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverPlan_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BusinessCutOverPlan_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String mode = "";
	public java.lang.String policy = "";
	public java.lang.String cutOverTime = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public BusinessCutOverPlan_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String mode, java.lang.String policy, java.lang.String cutOverTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.mode = mode;
		this.policy = policy;
		this.cutOverTime = cutOverTime;
		this.additionalInfo = additionalInfo;
	}
}
