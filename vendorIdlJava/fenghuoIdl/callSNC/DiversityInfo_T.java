package callSNC;

/**
 *	Generated from IDL definition of struct "DiversityInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class DiversityInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public DiversityInfo_T(){}
	public java.lang.String sRGType = "";
	public callSNC.SharedResource_T[] sharedResourceList;
	public DiversityInfo_T(java.lang.String sRGType, callSNC.SharedResource_T[] sharedResourceList)
	{
		this.sRGType = sRGType;
		this.sharedResourceList = sharedResourceList;
	}
}
