package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "ClockLinkNet_T"
 *	@author JacORB IDL compiler 
 */

public final class ClockLinkNet_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ClockLinkNet_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[][] aEndMENameList;
	public globaldefs.NameAndStringValue_T[][] zEndMENameList;
	public java.lang.String synchroProtocol = "";
	public topologicalLink.TopologicalLink_T[] topoList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ClockLinkNet_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[][] aEndMENameList, globaldefs.NameAndStringValue_T[][] zEndMENameList, java.lang.String synchroProtocol, topologicalLink.TopologicalLink_T[] topoList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.aEndMENameList = aEndMENameList;
		this.zEndMENameList = zEndMENameList;
		this.synchroProtocol = synchroProtocol;
		this.topoList = topoList;
		this.additionalInfo = additionalInfo;
	}
}
