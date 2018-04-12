package performance;

/**
 *	Generated from IDL definition of struct "TCAParameterProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameterProfile_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAParameterProfile_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public short layerRate;
	public performance.TCAParameter_T[] tcaParameterList;
	public TCAParameterProfile_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] additionalInfo, short layerRate, performance.TCAParameter_T[] tcaParameterList)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.additionalInfo = additionalInfo;
		this.layerRate = layerRate;
		this.tcaParameterList = tcaParameterList;
	}
}
