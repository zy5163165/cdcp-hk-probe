package extendedMLSNMgr;

/**
 *	Generated from IDL definition of struct "TNetworkProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class TNetworkProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TNetworkProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionType = "";
	public protection.ProtectionGroupType_T protectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public short rate;
	public globaldefs.NameAndStringValue_T[][] pgpNameList;
	public globaldefs.NameAndStringValue_T[][] tpNameList;
	public globaldefs.NameAndStringValue_T[][] sncProtectedNameList;
	public globaldefs.NameAndStringValue_T[][] sncProtectingNameList;
	public globaldefs.NameAndStringValue_T[] pgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TNetworkProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionType, protection.ProtectionGroupType_T protectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, short rate, globaldefs.NameAndStringValue_T[][] pgpNameList, globaldefs.NameAndStringValue_T[][] tpNameList, globaldefs.NameAndStringValue_T[][] sncProtectedNameList, globaldefs.NameAndStringValue_T[][] sncProtectingNameList, globaldefs.NameAndStringValue_T[] pgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionType = protectionType;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.pgpNameList = pgpNameList;
		this.tpNameList = tpNameList;
		this.sncProtectedNameList = sncProtectedNameList;
		this.sncProtectingNameList = sncProtectingNameList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
