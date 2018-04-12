package mLSNPP;

/**
 *	Generated from IDL definition of struct "MultiLayerSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MultiLayerSNPP_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public terminationPoint.Directionality_T direction;
	public mLSNPP.LayeredSNPP_T[] layeredSNPPList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultiLayerSNPP_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, terminationPoint.Directionality_T direction, mLSNPP.LayeredSNPP_T[] layeredSNPPList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.layeredSNPPList = layeredSNPPList;
		this.additionalInfo = additionalInfo;
	}
}
