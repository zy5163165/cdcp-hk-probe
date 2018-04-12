package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "BusinessCutOverGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BusinessCutOverGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public java.lang.String userLabel = "";
	public extendedEmsMgr.NamePair_T[] businessCutOverSncList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public BusinessCutOverGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, java.lang.String userLabel, extendedEmsMgr.NamePair_T[] businessCutOverSncList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.userLabel = userLabel;
		this.businessCutOverSncList = businessCutOverSncList;
		this.additionalInfo = additionalInfo;
	}
}
